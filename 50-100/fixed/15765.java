@java.lang.Override
public java.lang.String[] getPlayerGroups(org.bukkit.entity.Player player, java.lang.String world) {
    if (plugin.config.isDefaultrankallworlds()) {
        world = null;
    }
    if ((plugin.config.permissionpluginhasworldsupport()) == false) {
        world = null;
    }
    return net.slipcor.classranks.handlers.HandleVaultPerms.permission.getPlayerGroups(world, player.getName());
}