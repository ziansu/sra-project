private boolean isHexInteger(java.lang.String token) {
    if (((token.length()) < 3) || ((!(token.startsWith("0X"))) && (!(token.startsWith("0x"))))) {
        return false;
    }
    java.lang.String body = token.substring(2);
    try {
        java.lang.Integer.parseInt(body, 16);
        return true;
    } catch (java.lang.NumberFormatException ex) {
        return false;
    }
}