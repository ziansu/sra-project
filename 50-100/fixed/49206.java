public void onEnable() {
    saveDefaultConfig();
    final org.bukkit.plugin.PluginManager pm = org.bukkit.Bukkit.getPluginManager();
    pm.registerEvents(new com.baol.chatdistance.events.Chat(this), this);
    pm.registerEvents(new com.baol.chatdistance.events.JoinAndDisconnect(this), this);
    pm.registerEvents(new com.baol.chatdistance.events.Death(this), this);
    org.bukkit.Bukkit.getConsoleSender().sendMessage((("§a" + (this)) + " has been enabled!"));
}