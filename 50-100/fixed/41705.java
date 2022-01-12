private void setupPermissions() {
    org.bukkit.plugin.Plugin test = this.getServer().getPluginManager().getPlugin("Permissions");
    if ((joren.spawn.Spawn.permissions) == null) {
        if (test != null) {
            joren.spawn.Spawn.permissions = ((com.nijikokun.bukkit.Permissions.Permissions) (test)).getHandler();
            joren.spawn.Spawn.info("Permission system found, plugin enabled");
        }else {
            usePermissions = false;
        }
    }
}