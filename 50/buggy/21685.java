public static boolean isValidJavaVersion(int[] javaVersion) {
    if (((javaVersion[0]) < 8) & ((javaVersion[1]) < 101)) {
        return false;
    }
    return true;
}