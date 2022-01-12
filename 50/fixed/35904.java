@java.lang.Override
public java.lang.Object afterMethod(com.a.eye.skywalking.api.plugin.interceptor.enhance.StaticMethodInvokeContext interceptorContext, java.lang.Object ret) {
    return com.a.eye.skywalking.api.context.ContextManager.getTraceSegmentId();
}