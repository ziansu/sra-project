public static boolean registerGlobalBinderDelayed(java.lang.String name, com.qihoo360.replugin.IBinderGetter getter) {
    if (!(RePluginFramework.mHostInitialized)) {
        return false;
    }
    try {
        java.lang.Object obj = com.qihoo360.replugin.RePlugin.ProxyRePluginVar.registerGlobalBinderDelayed.call(null, name, getter);
        if (obj != null) {
            return ((java.lang.Boolean) (obj));
        }
    } catch (java.lang.Exception e) {
        if (com.qihoo360.replugin.helper.LogDebug.LOG) {
            e.printStackTrace();
        }
    }
    return false;
}