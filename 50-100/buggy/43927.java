public static boolean isIPandPort(java.lang.String string) {
    boolean Str = false;
    java.lang.String[] IPandPort = string.split(":");
    if ((com.unimelb.comp90015.fourLiterGroup.ezshare.utils.utils.isAddress(IPandPort[0])) && (com.unimelb.comp90015.fourLiterGroup.ezshare.utils.utils.isPort(IPandPort[1]))) {
        Str = true;
    }
    return Str;
}