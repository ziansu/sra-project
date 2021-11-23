public static java.util.List<java.nio.file.Path> listFilesByExt(java.nio.file.Path directory, java.lang.String ext) throws java.io.IOException {
    java.nio.file.DirectoryStream<java.nio.file.Path> dirStream;
    if (!(org.apache.commons.lang3.StringUtils.isEmpty(ext))) {
        dirStream = java.nio.file.Files.newDirectoryStream(directory, new martinutils.io.PathUtil.PathFilterByExtension(ext));
    }else {
        dirStream = java.nio.file.Files.newDirectoryStream(directory);
    }
    java.util.List<java.nio.file.Path> files = new java.util.ArrayList<>();
    for (java.nio.file.Path file : dirStream) {
        files.add(file);
    }
    return files;
}