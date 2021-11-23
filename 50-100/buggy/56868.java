public java.io.File getMetadataFile(java.lang.String cruiseExpocode, java.lang.String uploadName) throws java.lang.IllegalArgumentException {
    java.lang.String expocode = gov.noaa.pmel.socat.dashboard.server.DashboardServerUtils.checkExpocode(cruiseExpocode);
    java.lang.String basename = gov.noaa.pmel.socat.dashboard.shared.DashboardUtils.baseName(uploadName);
    if (basename.isEmpty())
        throw new java.lang.IllegalArgumentException(("Invalid metadate document name " + uploadName));
    
    java.io.File metadataFile = new java.io.File(filesDir, (((((expocode.substring(0, 4)) + (java.io.File.separator)) + expocode) + "_") + basename));
    return metadataFile;
}