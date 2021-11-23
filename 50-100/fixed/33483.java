public static int digit(int codePoint, int radix) {
    if ((radix < (org.teavm.classlib.java.lang.TCharacter.MIN_RADIX)) || (radix > (org.teavm.classlib.java.lang.TCharacter.MAX_RADIX))) {
        return -1;
    }
    int d = org.teavm.classlib.java.lang.TCharacter.getNumericValue(codePoint);
    return d < radix ? d : -1;
}