private static java.lang.String GetPath(java.lang.String defPath) {
    java.nio.file.Path currentRelativePath = java.nio.file.Paths.get("");
    java.lang.String s = ((currentRelativePath.toAbsolutePath().toString()) + "\\") + defPath;
    return s;
}