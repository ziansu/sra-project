public static java.lang.String toZeroPrefixed(int value) {
    if ((value >= 0) && (value <= 9)) {
        return "0".concat(java.lang.String.valueOf(value));
    }
    return java.lang.String.valueOf(value);
}