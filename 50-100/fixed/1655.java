static void injectBaseContext(android.content.Context context) {
    com.plugin.util.LogUtil.d("替换宿主程序Application对象的mBase");
    android.content.Context base = ((android.content.Context) (com.plugin.util.RefInvoker.getFieldObject(context, android.content.ContextWrapper.class.getName(), com.plugin.core.PluginInjector.android_content_ContextWrapper_mBase)));
    android.content.Context newBase = new com.plugin.core.PluginBaseContextWrapper(base);
    com.plugin.util.RefInvoker.setFieldObject(context, android.content.ContextWrapper.class.getName(), com.plugin.core.PluginInjector.android_content_ContextWrapper_mBase, newBase);
}