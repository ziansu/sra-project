public static boolean isOOrHigher() {
    if ((com.holiestar.toolkit.utils.UtilSystem.isOOrHigher) == null) {
        com.holiestar.toolkit.utils.UtilSystem.isOOrHigher = (Build.VERSION.SDK_INT) >= 26;
    }
    return com.holiestar.toolkit.utils.UtilSystem.isOOrHigher;
}