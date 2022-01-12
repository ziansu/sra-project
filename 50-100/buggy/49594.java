@java.lang.Override
public byte[] from(java.lang.Object value, int length, int decimals, boolean addPadding) throws dk.nversion.copybook.exceptions.TypeConverterException {
    long i = ((long) (value));
    byte[] strBytes = getSignedBytes(java.lang.Long.toString(i), (i < 0L));
    if (addPadding) {
        strBytes = padBytes(strBytes, length);
    }
    return strBytes;
}