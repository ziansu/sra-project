public static boolean isValidJavaVersion(int[] javaVersion) {
    if ((javaVersion[0]) < 8) {
        return false;
    }
    if ((javaVersion[1]) < 101) {
        return false;
    }
    return true;
}