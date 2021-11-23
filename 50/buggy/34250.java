public int read(final byte[] buffer) throws java.io.IOException {
    com.google.gwt.core.shared.impl.InternalPreconditions.checkNotNull(buffer);
    return this.read(buffer, 0, buffer.length);
}