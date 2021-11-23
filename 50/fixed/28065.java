private boolean canWriteToFile(java.lang.String filePath) {
    java.io.File file = new java.io.File(filePath).getParentFile();
    if (file == null)
        return false;
    
    return file.canWrite();
}