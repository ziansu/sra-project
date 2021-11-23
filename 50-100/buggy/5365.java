public static android.content.Intent intent_openApp(android.content.Context context, java.lang.String appPackage, android.os.Bundle bundle) {
    android.content.pm.PackageManager manager = context.getPackageManager();
    android.content.Intent intent = manager.getLaunchIntentForPackage(appPackage);
    intent.addCategory(Intent.CATEGORY_LAUNCHER);
    if (bundle != null)
        intent.putExtras(bundle);
    
    return intent;
}