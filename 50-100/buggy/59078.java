public static java.io.InputStream getFileInputSteam(android.content.Context context, java.lang.String fileName, android.net.Uri rootUri, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(context, rootUri, subDirs);
    if (parent == null)
        return null;
    
    fileName = ml.puredark.hviewer.utils.DocumentUtil.filenameFilter(android.net.Uri.decode(fileName));
    android.support.v4.provider.DocumentFile file = parent.findFile(fileName);
    return ml.puredark.hviewer.utils.DocumentUtil.getFileInputSteam(context, file.getUri());
}