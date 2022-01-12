private static void initializePhoneApp() {
    android.content.Intent i = new android.content.Intent(android.content.Intent.ACTION_CALL, android.net.Uri.parse("tel:"));
    android.content.pm.PackageManager pm = com.anna.util.MyApplication.getAppContext().getPackageManager();
    final android.content.pm.ResolveInfo mInfo = pm.resolveActivity(i, 0);
    com.anna.util.Module.supportedModuleNames.add(mInfo.loadLabel(pm).toString());
}