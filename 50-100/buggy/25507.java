public static java.lang.String getRelativePathName(java.nio.file.Path root, java.nio.file.Path path) {
    java.nio.file.Path relative = root.relativize(path);
    return (java.nio.file.Files.isDirectory(relative)) && (!(relative.toString().endsWith("/"))) ? java.lang.String.format("%s/", relative.toString()) : relative.toString();
}