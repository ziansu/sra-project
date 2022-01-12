public void onEnable() {
    saveDefaultConfig();
    final org.bukkit.plugin.PluginManager pm = org.bukkit.Bukkit.getPluginManager();
    org.bukkit.Bukkit.getConsoleSender().sendMessage((("§a" + (this)) + " has been enabled!"));
    pm.registerEvents(new com.baol.chatdistance.events.Chat(this), this);
    pm.registerEvents(new com.baol.chatdistance.events.JoinAndDisconnect(this), this);
    pm.registerEvents(new com.baol.chatdistance.events.Death(this), this);
}