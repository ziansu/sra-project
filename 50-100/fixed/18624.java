public static int getPluginThemeIdByName(java.lang.String pluginId, java.lang.String themeName) {
    com.plugin.content.PluginDescriptor pd = com.plugin.core.PluginLoader.getPluginDescriptorByPluginId(pluginId);
    if (pd != null) {
        com.plugin.core.PluginLoader.ensurePluginInited(pd);
        if ((pd.getPluginContext()) != null) {
            return pd.getPluginContext().getResources().getIdentifier(themeName, "style", pd.getPackageName());
        }
    }
    return 0;
}