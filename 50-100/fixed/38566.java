public java.lang.String getVersion() {
    java.lang.String result = null;
    com.emc.storageos.scaleio.api.ParsePattern parse = new com.emc.storageos.scaleio.api.ParsePattern("EMC ScaleIO Version:\\s+[a-zA-Z](.*?)", com.emc.storageos.scaleio.api.ScaleIOConstants.SCALEIO_VERSION);
    java.util.List<java.lang.String> versions = parse.isMatch(systemVersionName);
    if ((versions != null) && (!(versions.isEmpty()))) {
        result = versions.get(0);
    }
    return result;
}