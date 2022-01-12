public static java.util.Set<java.lang.String> stripRPTargetFromReplicationGroup(java.util.Collection<java.lang.String> groups) {
    java.util.Set<java.lang.String> stripped = new java.util.HashSet<java.lang.String>();
    for (java.lang.String group : groups) {
        stripped.add(com.emc.sa.service.vipr.block.BlockStorageUtils.stripRPTargetFromReplicationGroup(group));
    }
    return stripped;
}