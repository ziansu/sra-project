@java.lang.Override
public chav1961.purelib.basic.BitCharSet add(final char symbol) {
    if ((symbol >> 6) >= (data.length)) {
        final long[] newData = new long[(symbol + 63) >> 6];
        java.lang.System.arraycopy(data, 0, newData, 0, data.length);
        data = newData;
    }
    return super.add(symbol);
}