public java.util.List<org.shanerx.projectbudder.perms.api.PermissionGroup> getGroupsByLevel(int permission) {
    java.util.List<org.shanerx.projectbudder.perms.api.PermissionGroup> groups = new java.util.ArrayList<>();
    for (java.lang.String configKey : fc.getConfigurationSection("groups").getKeys(false)) {
        if ((fc.getInt((configKey + ".level"))) >= permission) {
            groups.add(new org.shanerx.projectbudder.perms.api.PermissionGroup(configKey.split(".")[1], plugin));
        }
    }
    return groups;
}