private static boolean isRunningN() {
    return (Build.VERSION.CODENAME.equals("N")) || ((Build.VERSION.SDK_INT) > (Build.VERSION_CODES.M));
}