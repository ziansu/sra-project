private static java.lang.Object getMetaData(android.content.Context context, java.lang.String key) {
    java.lang.Object metaData = null;
    try {
        android.content.pm.ApplicationInfo info = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.GET_META_DATA);
        android.os.Bundle bundle = info.metaData;
        if (bundle != null)
            metaData = ((java.lang.String) (bundle.get(key)));
        
    } catch (android.content.pm.PackageManager.NameNotFoundException e) {
        e.printStackTrace();
    }
    return metaData;
}