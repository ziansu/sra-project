@java.lang.Override
public boolean accept(java.io.File dir, java.lang.String name) {
    if (name.endsWith(gov.noaa.pmel.socat.dashboard.handlers.MetadataFileHandler.METADATA_INFOFILE_SUFFIX))
        return true;
    
    return false;
}