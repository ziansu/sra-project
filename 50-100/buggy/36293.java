public static void extract(java.nio.file.FileSystem zipFile, java.nio.file.Path toDir) throws java.io.IOException {
    java.nio.file.Files.createDirectories(toDir);
    for (java.nio.file.Path root : zipFile.getRootDirectories()) {
        try (java.nio.file.DirectoryStream<java.nio.file.Path> paths = java.nio.file.Files.newDirectoryStream(root)) {
            for (java.nio.file.Path path : paths) {
                org.fao.geonet.utils.IO.copyDirectoryOrFile(path, toDir.resolve(path.getFileName().toString()), false);
            }
        }
    }
}