public static void main__(java.lang.String[] args) throws java.io.IOException {
    java.nio.file.Path dir = java.nio.file.Paths.get(args[0]);
    try (java.nio.file.DirectoryStream<java.nio.file.Path> stream = java.nio.file.Files.newDirectoryStream(dir, "*.{sql}")) {
        for (java.nio.file.Path path : stream) {
            org.sqlite.parser.Main.parse(path);
        }
    }
}