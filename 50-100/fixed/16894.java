public void onEnable() {
    org.bukkit.Bukkit.getServer().getPluginManager().registerEvents(new net.twilightdevelopment.plugin.autohub.Join(this), this);
    org.bukkit.Bukkit.getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
    getCommand("hub").setExecutor(new net.twilightdevelopment.plugin.autohub.HubCommand(this));
    getCommand("sethub").setExecutor(new net.twilightdevelopment.plugin.autohub.HubCommand(this));
    saveDefaultConfig();
}