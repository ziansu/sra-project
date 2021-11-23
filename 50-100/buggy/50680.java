private boolean setupGroupManagerAPI() {
    final org.bukkit.plugin.PluginManager pluginManager = org.bukkit.Bukkit.getServer().getPluginManager();
    final org.bukkit.plugin.Plugin GMplugin = pluginManager.getPlugin("GroupManager");
    if ((GMplugin != null) && (GMplugin.isEnabled())) {
        groupManager = ((org.anjocaido.groupmanager.GroupManager) (GMplugin));
        debugmsg("Fetched GroupManager plugin");
        return true;
    }else {
        debugmsg("Failed to obtain GroupManager plugin");
        return false;
    }
}