@java.lang.Override
public javax.el.ExpressionFactory getExpressionFactory() {
    init();
    if ((expressionFactory) == null) {
        synchronized(this) {
            if ((expressionFactory) == null) {
                javax.enterprise.inject.spi.BeanManager bm = beanManager();
                if (bm == null) {
                    expressionFactory = application.getExpressionFactory();
                }else {
                    expressionFactory = bm.wrapExpressionFactory(application.getExpressionFactory());
                }
            }
        }
    }
    return expressionFactory;
}