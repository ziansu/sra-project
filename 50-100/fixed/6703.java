public void moveAttachmentToBackupFolder(java.lang.String path, java.lang.String filePath) {
    java.io.File source = new java.io.File(filePath);
    java.io.File dest = new java.io.File(path.trim());
    try {
        org.apache.commons.io.FileUtils.copyFileToDirectory(source, dest);
    } catch (java.io.IOException e) {
        org.wso2.dynamictools.extension.zapwso2jiraplugin.FileHandleUtill.log.error("File not found in the specified path");
    }
}