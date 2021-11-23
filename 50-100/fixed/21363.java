public static java.lang.String standardiseAddress(java.lang.String in) {
    if (in != null) {
        java.lang.String rVal = in.trim().toLowerCase();
        if (!(rVal.endsWith("."))) {
            rVal = rVal + ".";
        }
        return rVal;
    }
    return null;
}