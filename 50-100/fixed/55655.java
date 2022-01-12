public int sizeOnDisk() {
    int size = super.sizeOnDisk();
    size += 2;
    size += (im.getWidth()) * (im.getHeight());
    size += 2;
    if ((ddtIm) != null) {
        size += (ddtIm.getWidth()) * (ddtIm.getHeight());
    }
    return size;
}