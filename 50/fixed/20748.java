@java.lang.Override
public java.lang.Object afterMethod(com.a.eye.skywalking.api.plugin.interceptor.EnhancedClassInstanceContext context, com.a.eye.skywalking.api.plugin.interceptor.enhance.InstanceMethodInvokeContext interceptorContext, java.lang.Object ret) {
    this.whenExist(context);
    return ret;
}