private boolean hasNoPackageName(java.lang.String classPath, java.io.File testFile, java.lang.String packageName) {
    return packageName.contains(((("\\" + classPath) + "\\") + (testFile.getName())));
}