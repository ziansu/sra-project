public boolean tryArchive() {
    try {
        java.io.File archiveDir = getArchiveStorageDir();
        tryWriteToFile(archiveDir);
        return true;
    } catch (java.lang.Exception ex) {
        this.error = ex.getMessage();
        return false;
    }
}