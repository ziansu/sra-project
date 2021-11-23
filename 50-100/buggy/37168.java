private static int toIndex(java.lang.String str) {
    int index = -1;
    if (org.apache.commons.lang.StringUtils.isNumeric(str)) {
        try {
            index = java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException ignore) {
        }
    }
    return str.equals(java.lang.String.valueOf(index)) ? index : -1;
}