public java.util.List<de.mark615.xpermission.object.Group> loadGroups() {
    if ((permission.getConfigurationSection("permissions")) == null)
        return null;
    
    java.util.List<de.mark615.xpermission.object.Group> groups = new java.util.ArrayList<>();
    for (java.lang.String gp : permission.getConfigurationSection("permissions.groups").getKeys(false)) {
        de.mark615.xpermission.object.Group group = new de.mark615.xpermission.object.Group(permission.getConfigurationSection(("permissions.groups." + gp)));
        groups.add(group);
    }
    de.mark615.xpermission.object.XUtil.info("Permissiongroups loaded successfully");
    return groups;
}