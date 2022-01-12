@org.jetbrains.annotations.Contract(value = "null -> false")
private static boolean isHeaderFile(@org.jetbrains.annotations.Nullable
com.intellij.openapi.vfs.VirtualFile[] files) {
    boolean result = true;
    for (com.intellij.openapi.vfs.VirtualFile file : files) {
        result &= (file.exists()) && (file.getName().endsWith(".h"));
    }
    return result;
}