public boolean hasPermission(org.bukkit.command.CommandSender sender, java.lang.String permission) {
    return ((com.sk89q.bukkit.migration.PermissionsResolverManager) (this.permissionsManager)).hasPermission(sender.getName(), (((getDescription().getName().toLowerCase()) + ".") + permission));
}