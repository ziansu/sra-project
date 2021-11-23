public io.github.guggle.utils.Fnv hashBoolean(final boolean b) {
    return hashByte(((byte) (b ? 1 : 0)));
}