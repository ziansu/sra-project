public com.avconv4java.option.AVVideoOptions resize(final java.lang.Integer width, final java.lang.Integer height) {
    final java.lang.StringBuilder size = new java.lang.StringBuilder();
    if (width != null) {
        size.append(java.lang.String.valueOf(width));
    }
    size.append("x");
    if (height != null) {
        size.append(java.lang.String.valueOf(height));
    }
    return flags("-s:v", size);
}