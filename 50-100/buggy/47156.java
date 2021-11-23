private void downloadSelectedFile() {
    java.lang.String defaultFolder = ((java.lang.System.getProperty("user.home")) + (java.io.File.separator)) + "Downloads";
    com.microsoftopentechnologies.intellij.helpers.storage.BlobFile fileSelection = getFileSelection();
    if (fileSelection != null) {
        downloadSelectedFile(new java.io.File(((defaultFolder + (java.io.File.separator)) + (fileSelection.getName()))));
    }
}