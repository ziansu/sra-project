@java.lang.Override
public void removeGroups(org.bukkit.entity.Player player, java.lang.String world) {
    if (plugin.config.isDefaultrankallworlds()) {
        world = null;
    }
    if ((plugin.config.permissionpluginhasworldsupport()) == false) {
        world = null;
    }
    java.lang.String[] list = net.slipcor.classranks.handlers.HandleVaultPerms.permission.getPlayerGroups(world, player);
    if (list != null) {
        for (java.lang.String sRank : list) {
            net.slipcor.classranks.handlers.HandleVaultPerms.permission.playerRemoveGroup(world, player, sRank);
        }
    }
}