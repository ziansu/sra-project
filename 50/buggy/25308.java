static int getValue(final java.lang.String value, final int sn) {
    if (value == "sn") {
        return sn;
    }
    return java.lang.Integer.parseInt(value);
}