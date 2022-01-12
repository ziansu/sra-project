public static boolean isPowerOfTwo(long number) {
    if (number <= 0) {
        throw new java.lang.IllegalArgumentException((("number: " + number) + ". Number cannot be neagative."));
    }
    if ((number & (-number)) == number) {
        return true;
    }
    return false;
}