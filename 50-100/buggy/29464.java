@java.lang.Override
protected void onLoaderStart(java.io.File file, boolean isForceStop) {
    java.awt.image.BufferedImage thumbnail = thumbnails.get(file, 32, 32, false, true, ImageUtils.FORMAT.JPG);
    if (thumbnail != null) {
        showImage(file, thumbnail);
    }else {
        showImage(file, null);
    }
}