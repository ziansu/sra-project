private static final byte hexChar(byte val) {
    val &= 15;
    if (val < 10) {
        return ((byte) (((char) (val)) + '0'));
    }else {
        return ((byte) (((char) (val - 10)) + 'a'));
    }
}