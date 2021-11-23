public void setApplicationContext(org.springframework.context.ApplicationContext ctx) throws org.springframework.beans.BeansException {
    java.util.Map<java.lang.String, java.lang.Object> beanMap = ctx.getBeansWithAnnotation(org.cxytiandi.conf.client.annotation.CxytianDiConf.class);
    check(beanMap);
    init(beanMap);
}