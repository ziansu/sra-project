public int sizeOnDisk() {
    int size = super.sizeOnDisk();
    size += 2;
    size += (im.getWidth()) * (im.getHeight());
    if ((ddtIm) != null) {
        size += 2;
        size += (ddtIm.getWidth()) * (ddtIm.getHeight());
    }
    return size;
}