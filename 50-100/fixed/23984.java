public static android.support.v4.provider.DocumentFile createFileIfNotExist(android.content.Context context, java.lang.String mimeType, java.lang.String fileName, android.net.Uri rootUri, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = ml.puredark.hviewer.utils.DocumentUtil.createDirIfNotExist(context, rootUri, subDirs);
    android.support.v4.provider.DocumentFile file = parent.findFile(fileName);
    if (file == null) {
        file = parent.createFile(mimeType, fileName);
    }
    return file;
}