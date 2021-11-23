private static java.util.List<android.content.pm.ResolveInfo> getPluginReceivers(@android.support.annotation.NonNull
final android.content.Context context) {
    final java.lang.String packageName = context.getPackageName();
    final java.util.List<android.content.pm.ResolveInfo> result = new java.util.LinkedList<android.content.pm.ResolveInfo>();
    for (final android.content.pm.ResolveInfo x : context.getPackageManager().queryBroadcastReceivers(new <android.content.com.twofortyfouram.locale.api.Intent>android.content.Intent(), PackageManager.GET_INTENT_FILTERS)) {
        if (packageName.equals(x.activityInfo.packageName)) {
            result.add(x);
        }
    }
    return result;
}