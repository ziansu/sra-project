static int getValue(final java.lang.String value, final int sn) {
    if ("sn".equals(value)) {
        return sn;
    }
    return java.lang.Integer.parseInt(value);
}