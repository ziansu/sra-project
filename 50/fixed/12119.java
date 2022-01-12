@java.lang.Override
public java.util.Iterator<java.lang.Object> iterator() {
    return this.getReducedChunkValues(readOptions, f, init, bundleSize);
}