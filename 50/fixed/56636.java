public static boolean exists(final java.lang.String path) {
    return new java.io.File((((path + "/") + (com.orientechnologies.orient.core.metadata.OMetadataDefault.CLUSTER_INTERNAL_NAME)) + (OPaginatedCluster.DEF_EXTENSION))).exists();
}