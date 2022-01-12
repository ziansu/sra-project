private void registerEvents() {
    org.bukkit.plugin.PluginManager manager = plugin.getServer().getPluginManager();
    manager.registerEvent(Event.Type.PLAYER_JOIN, new ru.tehkode.permissions.bukkit.BukkitPermissions.PlayerEvents(), Event.Priority.Low, plugin);
    manager.registerEvent(Event.Type.CUSTOM_EVENT, new ru.tehkode.permissions.bukkit.BukkitPermissions.PEXEvents(), Event.Priority.Low, plugin);
    if (this.enableParentNodes) {
        org.bukkit.event.server.ServerListener serverEvents = new ru.tehkode.permissions.bukkit.BukkitPermissions.ServerEvents();
        manager.registerEvent(Event.Type.PLUGIN_ENABLE, serverEvents, Event.Priority.Low, plugin);
    }
}