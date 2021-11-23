public java.lang.Iterable<java.lang.String> apply(final java.lang.String a) {
    final java.io.File f = new java.io.File(a);
    final java.lang.String modifiedFilePath = f.getAbsolutePath();
    final java.lang.String fileName = f.getName();
    if ((modifiedFilePath.startsWith(this.sourceRoot)) && ((fileName.indexOf('.')) != (-1))) {
        return createClassGlobFromFilePath(this.sourceRoot, modifiedFilePath);
    }
    return java.util.Collections.emptyList();
}