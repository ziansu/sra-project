public void copyImgFolder(android.content.Context context) {
    java.lang.String targetPath = (((context.getFilesDir()) + "/") + (com.hunk.astub.Core.IMG_PATH)) + "/";
    if (new java.io.File(targetPath).exists()) {
        mImgFolderPath = targetPath;
        return ;
    }
    if (com.hunk.astub.FileUtil.copyAssetFolder(context, com.hunk.astub.Core.IMG_PATH, targetPath)) {
        mImgFolderPath = targetPath;
    }
}