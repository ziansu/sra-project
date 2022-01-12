public static boolean loadData(java.lang.String pluginName) {
    boolean isLoaded = false;
    for (me.kapehh.main.pluginmanager.config.PluginConfig pluginConfig : me.kapehh.main.pluginmanager.config.PluginConfig.pluginConfigs) {
        if (pluginConfig.getPluginName().equalsIgnoreCase(pluginName)) {
            pluginConfig.loadData();
            isLoaded = true;
        }
    }
    return isLoaded;
}