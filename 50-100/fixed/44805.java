public void initEvents() {
    org.bukkit.plugin.PluginManager pm = org.bukkit.Bukkit.getPluginManager();
    pm.registerEvents(new com.github.nathannr.halloweenfun.listener.ListenerJoin(), this);
    pm.registerEvents(new com.github.nathannr.halloweenfun.listener.ListenerSpawn(), this);
    pm.registerEvents(new com.github.nathannr.halloweenfun.listener.ListenerDeath(), this);
}