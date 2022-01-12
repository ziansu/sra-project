public void onEnable() {
    registerListeners();
    registerCommands();
    getDataFolder().mkdir();
    loadFiles();
    com.deltadrivedevelopment.wigglyWorlds.WigglyWorlds.p = this;
    com.deltadrivedevelopment.wigglyWorlds.WigglyWorlds.wep = ((com.sk89q.worldedit.bukkit.WorldEditPlugin) (org.bukkit.Bukkit.getPluginManager().getPlugin("WorldEdit")));
    if ((com.deltadrivedevelopment.wigglyWorlds.WigglyWorlds.wep) == null) {
        this.getServer().getLogger().severe("No world edit plugin found, disabling plugin");
        org.bukkit.Bukkit.getPluginManager().disablePlugin(this);
    }
    getLogger().info("World edit found, wep is not null");
}