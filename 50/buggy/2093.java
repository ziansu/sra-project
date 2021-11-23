public com.avconv4java.option.AVVideoOptions filter(final java.lang.String filter) {
    return flags("-vf", java.lang.String.format("%s", filter));
}