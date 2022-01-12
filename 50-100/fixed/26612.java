public static boolean deleteFile(java.lang.String fileName, android.support.v4.provider.DocumentFile root, java.lang.String... subDirs) {
    android.support.v4.provider.DocumentFile parent = ml.puredark.hviewer.utils.DocumentUtil.getDirDocument(root, subDirs);
    if (parent == null)
        return false;
    
    android.support.v4.provider.DocumentFile file = parent.findFile(fileName);
    return ((file != null) && (file.exists())) && (file.delete());
}