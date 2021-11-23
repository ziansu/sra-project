@java.lang.Override
public boolean checkHeader(final byte[] block) {
    try (final io.scif.io.RandomAccessInputStream stream = new io.scif.io.RandomAccessInputStream(getContext(), block)) {
        return isFormat(stream);
    } catch (final java.io.IOException e) {
        log().debug("", e);
    }
    return false;
}