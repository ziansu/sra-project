private java.awt.image.BufferedImage resizeImage(java.awt.image.BufferedImage originalImage, com.images3.data.impl.ResizingConfig resizingConfig) {
    java.awt.image.BufferedImage resizedImage = null;
    if (resizingConfig.isKeepProportions()) {
        resizedImage = org.imgscalr.Scalr.resize(originalImage, Scalr.Method.SPEED, Scalr.Mode.AUTOMATIC, resizingConfig.getWidth(), resizingConfig.getHeight());
    }else {
        resizedImage = org.imgscalr.Scalr.resize(originalImage, Scalr.Method.SPEED, Scalr.Mode.FIT_EXACT, resizingConfig.getWidth(), resizingConfig.getHeight());
    }
    return resizedImage;
}