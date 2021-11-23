@javax.annotation.PostConstruct
private void init(final javax.interceptor.InvocationContext context) throws java.lang.Exception {
    if ((cpf) == null) {
        return ;
    }
    boolean setInitializing = initializing.compareAndSet(false, true);
    if (!setInitializing) {
        context.proceed();
        return ;
    }
    final java.lang.Object beanInstance = context.getTarget();
    final com.sun.jersey.core.spi.component.ioc.IoCComponentProcessor icp = get(beanInstance.getClass());
    if (icp != null) {
        icp.postConstruct(beanInstance);
    }
    context.proceed();
}