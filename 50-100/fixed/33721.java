public static java.lang.String readClusterId() {
    try {
        java.io.File minimesosFile = com.containersol.minimesos.cluster.ClusterRepository.getMinimesosFile();
        java.lang.String clusterId = org.apache.commons.io.FileUtils.readFileToString(minimesosFile);
        com.containersol.minimesos.cluster.ClusterRepository.LOGGER.debug(((("Reading cluster ID from " + minimesosFile) + ": ") + clusterId));
        return clusterId;
    } catch (java.io.IOException e) {
        return null;
    }
}