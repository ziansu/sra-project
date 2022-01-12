public static void archiveDirectory(java.nio.file.Path destinationArchive, java.nio.file.Path sourceDirectory) throws java.io.IOException, org.wso2.carbon.components.exceptions.JarToBundleConverterException {
    if (!(java.nio.file.Files.isDirectory(sourceDirectory))) {
        java.lang.String message = java.lang.String.format("%s is not a directory.", sourceDirectory);
        throw new org.wso2.carbon.components.exceptions.JarToBundleConverterException(message);
    }
    java.util.zip.ZipOutputStream zipOutputStream = new java.util.zip.ZipOutputStream(java.nio.file.Files.newOutputStream(destinationArchive));
    org.wso2.carbon.util.Utils.zipDirectory(sourceDirectory, zipOutputStream, sourceDirectory);
    zipOutputStream.close();
}