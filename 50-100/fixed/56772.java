private static void deleteFileIfExists(java.io.File to) throws java.io.IOException {
    boolean fileDoesNotExist = !(to.exists());
    if (fileDoesNotExist) {
        return ;
    }
    boolean deleteOk = to.delete();
    if (deleteOk) {
        return ;
    }
    throw new java.io.IOException(("Unable to delete file: " + (to.getAbsolutePath())));
}