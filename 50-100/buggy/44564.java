@java.lang.Override
public void onPictureTaken(java.lang.String filePath) {
    com.gaadi.neon.util.FileInfo fileInfo = new com.gaadi.neon.util.FileInfo();
    fileInfo.setFilePath(filePath);
    fileInfo.setFileName(filePath.substring(((filePath.lastIndexOf("/")) + 1)));
    fileInfo.setSource(FileInfo.SOURCE.PHONE_CAMERA);
    if (cameraParams.getTagEnabled()) {
        fileInfo.setFileTag(tagModels.get(currentTag));
    }
    com.gaadi.neon.util.SingletonClass.getSingleonInstance().putInImageCollection(fileInfo);
}