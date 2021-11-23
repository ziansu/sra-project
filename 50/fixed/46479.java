public static void register(org.bukkit.plugin.java.JavaPlugin plugin, com.exorath.plugin.map.local.LocalMaps localMaps) {
    org.bukkit.command.PluginCommand command = plugin.getCommand("exomaps");
    command.setExecutor(new com.exorath.plugin.map.CommandRegistration(plugin, localMaps));
    command.setPermission("exorath.maps.cmd");
}