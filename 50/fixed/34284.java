public static java.lang.String stopCollectingStdErr() {
    if ((jloda.util.Basic.collectOut) != null) {
        java.lang.String result = jloda.util.Basic.collectOut.toString();
        jloda.util.Basic.collectOut = null;
        return result;
    }else
        return "";
    
}