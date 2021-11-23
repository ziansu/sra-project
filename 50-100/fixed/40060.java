public static java.lang.String fixCarrots(java.lang.String str) {
    java.lang.String retStr = "";
    if ((str != null) && ((str.length()) > 0)) {
        retStr = str.replaceAll("<", "&lt;");
        retStr = retStr.replaceAll(">", "&gt;");
    }
    return retStr;
}