public int setStride(int stride) {
    int prev = getStride();
    stride = java.lang.Math.max(stride, 1);
    stride = java.lang.Math.min(stride, ((dataLength) - 1));
    this.stride = stride;
    support.firePropertyChange("stride", prev, stride);
    return getStride();
}