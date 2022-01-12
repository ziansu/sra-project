private static OFile convertFile(java.io.File file) {
    if (file != null)
        return new OFile(file);
    
    return null;
}