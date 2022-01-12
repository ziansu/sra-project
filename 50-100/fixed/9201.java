protected boolean isIE7(java.lang.String userAgent) {
    if ((userAgent != null) && (!(userAgent.contains("; Trident/")))) {
        if (((userAgent.contains("; MSIE 5")) || (userAgent.contains("; MSIE 6"))) || (userAgent.contains("; MSIE 7"))) {
            return true;
        }
    }
    return false;
}