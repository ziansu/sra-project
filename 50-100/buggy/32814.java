public static java.util.List<java.lang.String> stripRPTargetFromReplicationGroup(java.util.Collection<java.lang.String> groups) {
    java.util.List<java.lang.String> stripped = new java.util.ArrayList<java.lang.String>();
    for (java.lang.String group : groups) {
        stripped.add(com.emc.sa.service.vipr.block.BlockStorageUtils.stripRPTargetFromReplicationGroup(group));
    }
    return stripped;
}