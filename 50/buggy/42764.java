private static java.io.File createFileFromPath(java.lang.String path) throws java.nio.file.FileAlreadyExistsException {
    java.io.File file = new java.io.File(path);
    if (file.exists()) {
        return file;
    }else {
        throw new java.nio.file.FileAlreadyExistsException("A file already exists with that name");
    }
}