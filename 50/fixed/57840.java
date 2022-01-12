public static int getUnsignedInteger(final byte b) {
    int unsignedInteger = b;
    if (b < 0) {
        unsignedInteger = b + 256;
    }
    return unsignedInteger;
}