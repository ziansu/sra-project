private static com.limpoxe.fairy.core.PluginAppTrace.Result beforeReceiver(android.os.Message msg) {
    if (com.limpoxe.fairy.util.ProcessUtil.isPluginProcess()) {
        android.content.Context newBase = com.limpoxe.fairy.core.PluginIntentResolver.resolveReceiverForClassLoader(msg.obj);
        if (newBase != null) {
            android.content.Context baseContext = com.limpoxe.fairy.core.PluginLoader.getApplication().getBaseContext();
            com.limpoxe.fairy.core.PluginInjector.replaceReceiverContext(baseContext, newBase);
            com.limpoxe.fairy.core.PluginAppTrace.Result result = new com.limpoxe.fairy.core.PluginAppTrace.Result();
            result.baseContext = baseContext;
            return result;
        }else {
        }
    }
    return null;
}