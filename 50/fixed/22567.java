private static java.lang.String GetPath(java.lang.String defPath) {
    java.nio.file.Path currentRelativePath = java.nio.file.Paths.get("");
    return ((currentRelativePath.toAbsolutePath().toString()) + "\\") + defPath;
}