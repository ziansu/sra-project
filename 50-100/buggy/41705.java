private void setupPermissions() {
    org.bukkit.plugin.Plugin test = this.getServer().getPluginManager().getPlugin("Permissions");
    if ((joren.spawn.Spawn.permissions) == null) {
        if (test != null) {
            joren.spawn.Spawn.permissions = ((com.nijikokun.bukkit.Permissions.Permissions) (test)).getHandler();
            joren.spawn.Spawn.info("Permission system found, plugin enabled");
        }else {
            joren.spawn.Spawn.info("Permission system not detected! Please go into the SpawnMob.properties and set use-permissions to false.");
            joren.spawn.Spawn.info("Please go into the SpawnMob.properties and set use-permissions to false.");
            usePermissions = false;
        }
    }
}