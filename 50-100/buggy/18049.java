public static java.io.OutputStream getFileOutputSteam(android.content.Context context, java.lang.String fileName, android.net.Uri rootUri, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(context, rootUri, subDirs);
    if (parent == null)
        return null;
    
    android.support.v4.provider.DocumentFile file = parent.findFile(fileName);
    return ml.puredark.hviewer.utils.DocumentUtil.getFileOutputSteam(context, file.getUri());
}