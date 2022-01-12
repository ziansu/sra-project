private void loadPlugin(alien4cloud.plugin.Plugin plugin) throws alien4cloud.plugin.exception.PluginLoadingException {
    try {
        java.nio.file.Path pluginPath = getPluginPath(plugin.getPluginPathId());
        java.nio.file.Path pluginUiPath = getPluginUiPath(plugin.getPluginPathId());
        loadPlugin(plugin, pluginPath, pluginUiPath);
    } catch (java.lang.Exception e) {
        log.error((("Failed to load plugin <" + (plugin.getId())) + "> alien will ignore this plugin."), e);
        throw new alien4cloud.plugin.exception.PluginLoadingException((("Failed to load plugin <" + (plugin.getId())) + ">"), e);
    }
}