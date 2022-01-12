private static java.lang.String getPath(@org.jetbrains.annotations.NotNull
com.intellij.openapi.vfs.VirtualFile root, @org.jetbrains.annotations.NotNull
com.intellij.openapi.vfs.VirtualFile file) {
    java.lang.String path = com.intellij.openapi.util.text.StringUtil.notNullize(mobi.hsz.idea.gitignore.util.Utils.getRelativePath(root, file));
    path = com.intellij.openapi.util.text.StringUtil.escapeChar(path, '[');
    path = com.intellij.openapi.util.text.StringUtil.escapeChar(path, ']');
    path = com.intellij.openapi.util.text.StringUtil.trimLeading(path, VfsUtil.VFS_PATH_SEPARATOR);
    return (com.intellij.openapi.vfs.VfsUtil.VFS_PATH_SEPARATOR) + path;
}