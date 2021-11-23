public void pluginError(java.lang.String input) {
    getLogger().warning((("[GUIShop] " + input) + " was not installed! This plugin is required!"));
    getServer().getPluginManager().disablePlugin(this);
}