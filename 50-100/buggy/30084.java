public static boolean loadData(java.lang.String pluginName) {
    boolean isLoaded = false;
    for (java.lang.ref.WeakReference<me.kapehh.main.pluginmanager.config.PluginConfig> weakPluginConfig : me.kapehh.main.pluginmanager.config.PluginConfig.pluginConfigs) {
        me.kapehh.main.pluginmanager.config.PluginConfig pluginConfig = weakPluginConfig.get();
        if ((pluginConfig != null) && (pluginConfig.getPluginName().equalsIgnoreCase(pluginName))) {
            pluginConfig.loadData();
            isLoaded = true;
        }
    }
    return isLoaded;
}