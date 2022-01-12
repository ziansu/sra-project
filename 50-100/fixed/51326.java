public void directoryWalkStep(int percentage, java.io.File file) {
    if (!(file.isFile())) {
        return ;
    }
    try {
        java.lang.String path = file.getAbsolutePath().substring(from.getAbsolutePath().length());
        org.apache.commons.io.FileUtils.copyFile(file, new java.io.File(to, path), false);
    } catch (java.io.IOException e) {
        throw new java.lang.IllegalStateException("Cannot copy dirtree.", e);
    }
}