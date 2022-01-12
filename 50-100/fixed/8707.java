@java.lang.Override
public org.jboss.invocation.Interceptor create(final org.jboss.invocation.InterceptorFactoryContext context) {
    final java.lang.reflect.Method method = SessionBeanHomeInterceptorFactory.INIT_METHOD.get();
    final java.lang.Object[] params = SessionBeanHomeInterceptorFactory.INIT_PARAMETERS.get();
    SessionBeanHomeInterceptorFactory.INIT_METHOD.remove();
    SessionBeanHomeInterceptorFactory.INIT_PARAMETERS.remove();
    return new org.jboss.as.ejb3.component.interceptors.AbstractEJBInterceptor() {
        @java.lang.Override
        public java.lang.Object processInvocation(final org.jboss.invocation.InterceptorContext context) throws java.lang.Exception {
            if (method != null) {
                method.invoke(context.getTarget(), params);
            }
            return context.proceed();
        }
    };
}