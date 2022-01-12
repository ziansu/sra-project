private int getScaledWidth() {
    if ((image) == null) {
        return 0;
    }
    return vectorImage ? image.getWidth() : ((int) ((zoomFactor) * (image.getWidth())));
}