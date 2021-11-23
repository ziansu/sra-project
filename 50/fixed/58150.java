public static boolean isPackageInstalled(android.content.Context context, java.lang.String packageName) {
    try {
        return (context.getPackageManager().getPackageInfo(packageName, PackageManager.GET_ACTIVITIES)) != null;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}