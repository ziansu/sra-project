@java.lang.Override
public boolean playerRemoveGroup(java.lang.String world, java.lang.String player, java.lang.String group) {
    if (world != null) {
        throw new java.lang.UnsupportedOperationException(((getName()) + " does not support world based groups."));
    }
    return plugin.getServer().dispatchCommand(ccs, ((("permissions player removegroup " + player) + " ") + group));
}