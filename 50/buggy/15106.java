public boolean intercept(com.sun.enterprise.deployment.LifecycleCallbackDescriptor.CallbackType eventType, com.sun.ejb.containers.EJBContextImpl ctx) throws java.lang.Throwable {
    return interceptorManager.intercept(eventType, ctx);
}