@Advice.OnMethodExit(inline = false)
public static void onInterceptingHttpAccessorCreated(@net.bytebuddy.asm.Advice.This
java.lang.Object httpAccessor) {
    final org.stagemonitor.requestmonitor.RequestMonitorPlugin requestMonitorPlugin = org.stagemonitor.core.Stagemonitor.getPlugin(org.stagemonitor.requestmonitor.RequestMonitorPlugin.class);
    ((org.springframework.http.client.support.InterceptingHttpAccessor) (httpAccessor)).getInterceptors().add(new org.stagemonitor.web.tracing.SpringRestTemplateContextPropagatingTransformer.SpringRestTemplateContextPropagatingInterceptor(requestMonitorPlugin));
}