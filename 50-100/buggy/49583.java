public long getTotalSize() {
    long totalSize = 0;
    if ((headersSize) != null) {
        totalSize += headersSize;
    }else {
        totalSize += getType().array().length;
        totalSize += org.ebml.Element.codedSizeLength(getSize());
    }
    totalSize += getSize();
    return totalSize;
}