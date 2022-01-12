public boolean isIgnoringGroup(java.lang.String name, vg.civcraft.mc.namelayer.group.Group group) {
    java.lang.String ignoreGroupName = "GROUP" + (group.getName());
    if (ignorePlayers.containsKey(name)) {
        java.util.List<java.lang.String> ignored = ignorePlayers.get(name);
        if (ignored == null) {
            return false;
        }
        if (ignored.contains(ignoreGroupName)) {
            return true;
        }
    }
    return false;
}