public static boolean isIcs() {
    boolean bRet = false;
    if ((Build.VERSION.SDK_INT) >= 14) {
        bRet = true;
    }
    return bRet;
}