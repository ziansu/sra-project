public static int getIntValue(java.lang.String val) {
    int iVal = 0;
    try {
        if (val != null) {
            iVal = java.lang.Integer.parseInt(val);
        }
    } catch (java.lang.NumberFormatException nfe) {
        com.owen.web.Util.printException(nfe);
    }
    return iVal;
}