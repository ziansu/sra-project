@java.lang.Override
protected org.jboss.as.ee.component.BasicComponentInstance instantiateComponentInstance(final java.util.concurrent.atomic.AtomicReference<org.jboss.as.naming.ManagedReference> instanceReference, final org.jboss.invocation.Interceptor preDestroyInterceptor, final java.util.Map<java.lang.reflect.Method, org.jboss.invocation.Interceptor> methodInterceptors, final org.jboss.invocation.InterceptorFactoryContext interceptorContext) {
    return new org.jboss.as.ejb3.component.entity.EntityBeanComponentInstance(this, instanceReference, preDestroyInterceptor, methodInterceptors);
}