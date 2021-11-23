public boolean canImport(com.intellij.openapi.vfs.VirtualFile fileOrDirectory, @org.jetbrains.annotations.Nullable
com.intellij.openapi.project.Project project) {
    if (fileOrDirectory.isDirectory()) {
        return true;
    }else {
        return canImportFromFile(fileOrDirectory);
    }
}