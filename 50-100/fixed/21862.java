@java.lang.Override
public boolean hasPerms(org.bukkit.entity.Player player, java.lang.String perm, java.lang.String world) {
    if ((net.slipcor.classranks.handlers.HandleVaultPerms.permission) == null) {
        java.lang.System.out.println("no VAULT not instance !");
        return false;
    }
    if (plugin.config.isDefaultrankallworlds()) {
        world = null;
    }
    if ((plugin.config.permissionpluginhasworldsupport()) == false) {
        world = null;
    }
    return net.slipcor.classranks.handlers.HandleVaultPerms.permission.playerHas(world, player.getName(), perm);
}