public static boolean isFakeNijiPerms(org.bukkit.plugin.Plugin plugin) {
    org.bukkit.command.PluginCommand permsCommand = org.bukkit.Bukkit.getServer().getPluginCommand("permissions");
    return !(permsCommand.getPlugin().equals(plugin));
}