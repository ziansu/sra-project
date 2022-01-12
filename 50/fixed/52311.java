private java.lang.String getSlaveIdFromCurrentUsagePath(java.lang.String path) {
    return path.substring((((path.indexOf(com.hubspot.singularity.data.UsageManager.SLAVE_PATH)) + (com.hubspot.singularity.data.UsageManager.SLAVE_PATH.length())) + 1), path.lastIndexOf("/"));
}