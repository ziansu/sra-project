private static java.lang.String getZoneNameFromInstanceId(java.lang.String instanceId) {
    int lastIndexOfSlash = instanceId.lastIndexOf("/");
    java.lang.String zoneName = instanceId.substring(0, (lastIndexOfSlash - 1));
    return zoneName;
}