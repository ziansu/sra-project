public static boolean writeBytes(android.content.Context context, byte[] data, java.lang.String fileName, android.net.Uri rootUri, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(context, rootUri, subDirs);
    if (parent == null)
        return false;
    
    fileName = android.net.Uri.decode(fileName);
    android.support.v4.provider.DocumentFile file = parent.findFile(fileName);
    return ml.puredark.hviewer.utils.DocumentUtil.writeBytes(context, data, file.getUri());
}