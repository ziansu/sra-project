public com.mongodb.gridfs.GridFSInputFile createFile(final java.io.File file) throws java.io.IOException {
    return createFile(new java.io.FileInputStream(file), file.getName(), true);
}