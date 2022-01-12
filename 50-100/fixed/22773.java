@org.jetbrains.annotations.Nullable
private static com.intellij.openapi.vfs.VirtualFile getJsStdLibJar(@org.jetbrains.annotations.NotNull
java.util.List<com.intellij.openapi.vfs.VirtualFile> classesRoots) {
    for (com.intellij.openapi.vfs.VirtualFile root : classesRoots) {
        if ((root.getFileSystem().getProtocol()) != (com.intellij.openapi.vfs.StandardFileSystems.JAR_PROTOCOL))
            continue;
        
        com.intellij.openapi.vfs.VirtualFile jar = com.intellij.openapi.vfs.VfsUtilCore.getVirtualFileForJar(root);
        if ((jar != null) && (org.jetbrains.kotlin.utils.LibraryUtils.isKotlinJavascriptStdLibrary(new java.io.File(jar.getPath())))) {
            return jar;
        }
    }
    return null;
}