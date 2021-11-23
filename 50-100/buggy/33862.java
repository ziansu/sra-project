public java.io.File getDiskFile(csns.model.core.File file, boolean followReference) {
    java.io.File diskFile = new java.io.File(fileDir, file.getId().toString());
    return ((diskFile.exists()) || (!followReference)) || ((file.getReference()) == null) ? diskFile : new java.io.File(fileDir, file.getReference().getId().toString());
}