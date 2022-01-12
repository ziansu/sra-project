private void addJSONSerializerInterceptor(com.navercorp.pinpoint.bootstrap.plugin.ProfilerPluginContext context) {
    com.navercorp.pinpoint.bootstrap.plugin.transformer.ClassFileTransformerBuilder builder = context.getClassFileTransformerBuilder("net.sf.json.JSONSerializer");
    builder.editMethod("toJSON", "java.lang.Object").injectInterceptor("com.navercorp.pinpoint.plugin.json.lib.interceptor.JsonLibMethodInterceptor", JsonLibConstants.SERVICE_TYPE).group(com.navercorp.pinpoint.plugin.json.lib.JsonLibPlugin.GROUP);
    builder.editMethod("toJava", "net.sf.json.JSON").injectInterceptor("com.navercorp.pinpoint.plugin.json.lib.interceptor.JsonLibMethodInterceptor", JsonLibConstants.SERVICE_TYPE).group(com.navercorp.pinpoint.plugin.json.lib.JsonLibPlugin.GROUP);
    java.lang.instrument.ClassFileTransformer transformer = builder.build();
    context.addClassFileTransformer(transformer);
}