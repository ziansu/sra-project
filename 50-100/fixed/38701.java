public static java.io.InputStream getFileInputSteam(android.content.Context context, java.lang.String fileName, java.lang.String rootPath, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(context, rootPath, subDirs);
    if (parent == null)
        return null;
    
    android.support.v4.provider.DocumentFile file = parent.findFile(fileName);
    if (file == null)
        return null;
    
    return ml.puredark.hviewer.utils.DocumentUtil.getFileInputSteam(context, file.getUri());
}