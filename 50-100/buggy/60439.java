private boolean isEditibleFileType(java.nio.file.Path f) {
    java.nio.file.Path fileName = f.getFileName();
    for (java.lang.String ext : org.fao.geonet.services.metadata.format.ListBundleFiles.extensions) {
        if (fileName.endsWith(("." + ext)))
            return true;
        
    }
    return fileName.toString().equalsIgnoreCase("README");
}