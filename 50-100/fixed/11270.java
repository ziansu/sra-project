private void addJSONObjectInterceptor(com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginContext context) {
    com.navercorp.pinpoint.bootstrap.plugin.transformer.ClassFileTransformerBuilder builder = context.getClassFileTransformerBuilder("net.sf.json.JSONObject");
    builder.editMethod("fromObject", "java.lang.Object").injectInterceptor("com.navercorp.pinpoint.plugin.json.lib.interceptor.JsonLibMethodInterceptor").group(com.navercorp.pinpoint.plugin.json.lib.JsonLibPlugin.GROUP);
    builder.editMethod("toBean", "net.sf.json.JSONObject").injectInterceptor("com.navercorp.pinpoint.plugin.json.lib.interceptor.JsonLibMethodInterceptor").group(com.navercorp.pinpoint.plugin.json.lib.JsonLibPlugin.GROUP);
    builder.editMethod("toString").injectInterceptor("com.navercorp.pinpoint.plugin.json.lib.interceptor.JsonLibMethodInterceptor").group(com.navercorp.pinpoint.plugin.json.lib.JsonLibPlugin.GROUP);
    java.lang.instrument.ClassFileTransformer transformer = builder.build();
    context.addClassFileTransformer(transformer);
}