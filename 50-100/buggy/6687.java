@java.lang.Override
public boolean isInGroup(java.lang.String world, java.lang.String permName, org.bukkit.entity.Player player) {
    if (plugin.config.isDefaultrankallworlds()) {
        java.lang.System.out.println("CR rankAddGlobal");
        world = null;
    }
    if ((plugin.config.permissionpluginhasworldsupport()) == false) {
        world = null;
    }
    return net.slipcor.classranks.handlers.HandleVaultPerms.permission.playerInGroup(world, player.getName(), permName);
}