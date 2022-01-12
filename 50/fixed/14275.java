public java.lang.Object getProperty(java.lang.String name, java.awt.image.ImageObserver observer) {
    if ((bufferedImage) == null) {
        return null;
    }
    return bufferedImage.getProperty(name, observer);
}