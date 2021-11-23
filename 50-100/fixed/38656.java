public static boolean isApplicationUpdated(android.content.Context context) {
    int currentVersionNumber = 0;
    try {
        currentVersionNumber = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    } catch (java.lang.Exception e) {
    }
    return currentVersionNumber > (com.myMinistry.util.PrefUtils.getVersionNumber(context)) ? true : false;
}