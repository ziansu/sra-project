public static boolean fileExistsInWowzaContentPath(com.wowza.wms.application.IApplicationInstance appInstance, java.lang.String mediaFilePrefix, java.lang.String mediaFilename) {
    if ((com.wowza.util.StringUtils.isEmpty(mediaFilename)) && (com.wowza.util.StringUtils.isEmpty(mediaFilePrefix)))
        return false;
    
    java.lang.String mediaFilePath = mediaFilePrefix + mediaFilename;
    java.lang.String wowzaContentPath = ((appInstance.getStreamStoragePath()) + (java.io.File.separator)) + mediaFilename;
    return !((!(com.wowza.wms.plugin.streampublisher.util.WowzaUtil.fileExists(mediaFilePath))) && (!(com.wowza.wms.plugin.streampublisher.util.WowzaUtil.fileExists(wowzaContentPath))));
}