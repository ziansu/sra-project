@java.lang.Override
public java.lang.Object getFromNative(long i) {
    short objLen = objectLengths.getShort(i);
    long offset = ((sizeof) * i) * (maxObjectLength);
    for (int j = 0; j < objLen; j++) {
        byteArray[j] = Utilities.UNSAFE.getByte((((ptr) + offset) + ((sizeof) * j)));
    }
    return pl.edu.icm.jlargearrays.ObjectLargeArray.fromByteArray(byteArray);
}