@java.lang.Override
public byte[] from(java.lang.Object value, int length, int decimals, boolean addPadding) throws dk.nversion.copybook.exceptions.TypeConverterException {
    int i = ((int) (value));
    byte[] strBytes = getSignedBytes(java.lang.Integer.toString(i), (i < 0));
    if (addPadding) {
        strBytes = padBytes(strBytes, length);
    }
    return strBytes;
}