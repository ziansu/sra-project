@java.lang.Override
public java.lang.String[] getPlayerGroups(org.bukkit.entity.Player player, java.lang.String world) {
    if (plugin.config.isDefaultrankallworlds()) {
        java.lang.System.out.println("CR rankAddGlobal");
        world = null;
    }
    if ((plugin.config.permissionpluginhasworldsupport()) == false) {
        world = null;
    }
    return net.slipcor.classranks.handlers.HandleVaultPerms.permission.getPlayerGroups(world, player.getName());
}