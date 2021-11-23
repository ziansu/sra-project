public static int hexToInt(java.lang.String text, int defaultValue) {
    try {
        return sic.common.SICXE.intToAddr(java.lang.Integer.parseInt(text, 16));
    } catch (java.lang.NumberFormatException e) {
        return defaultValue;
    }
}