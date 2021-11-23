public io.github.guggle.utils.Fnv hashBoolean(final boolean b) {
    hashByte(((byte) (b ? 1 : 0)));
    return this;
}