public static int getVersionCode(android.content.Context context) {
    try {
        if (context != null) {
            android.content.pm.PackageInfo pInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            return pInfo.versionCode;
        }
    } catch (android.content.pm.PackageManager.NameNotFoundException nnfe) {
        android.util.Log.e(org.adaptlab.chpir.android.survey.AppUtil.TAG, ("Error finding version code: " + nnfe));
    }
    return -1;
}