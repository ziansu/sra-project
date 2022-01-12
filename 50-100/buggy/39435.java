@java.lang.Override
public boolean accept(java.io.File dirFile) {
    if ((dirFile.isDirectory()) && (dirFile.exists())) {
        java.io.File resourceFile;
        resourceFile = eu.asterics.mw.services.ResourceRegistry.resolveRelativeFilePath(dirFile, resourcePathSlashified);
        return resourceFile.exists();
    }
    return false;
}