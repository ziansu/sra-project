public static boolean isOOrHigher() {
    if ((com.holiestar.toolkit.utils.UtilSystem.isKitkatOrHigher) == null) {
        com.holiestar.toolkit.utils.UtilSystem.isKitkatOrHigher = (Build.VERSION.SDK_INT) >= 26;
    }
    return com.holiestar.toolkit.utils.UtilSystem.isOOrHigher;
}