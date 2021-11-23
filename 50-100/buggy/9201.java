protected boolean isIE7(java.lang.String userAgent) {
    if (userAgent != null) {
        if ((((userAgent.contains("; MSIE 5")) || (userAgent.contains("; MSIE 6"))) || (userAgent.contains("; MSIE 7"))) && (!(userAgent.contains("; Trident/")))) {
            return true;
        }
    }
    return false;
}