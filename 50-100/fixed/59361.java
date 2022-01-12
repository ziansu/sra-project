public static boolean isIabServiceAvailable(android.content.Context context) {
    final android.content.pm.PackageManager packageManager = context.getPackageManager();
    java.util.List<android.content.pm.ResolveInfo> list = packageManager.queryIntentServices(com.anjlab.android.iab.v3.BillingProcessor.getBindServiceIntent(), 0);
    return (list != null) && ((list.size()) > 0);
}