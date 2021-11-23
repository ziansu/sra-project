@java.lang.Override
protected void onImageLoaded(java.io.File file, java.awt.image.BufferedImage image) {
    showImage(file, image);
    imagesMemoryCache.put(file, image);
    thumbnails.get(file, image, 32, 32, true, true, ImageUtils.FORMAT.JPG);
}