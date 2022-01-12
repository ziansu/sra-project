public void resetNativeHooks(android.content.Context context) {
    android.content.pm.PackageManager pm = context.getPackageManager();
    java.util.List<android.content.pm.ApplicationInfo> packages = pm.getInstalledApplications(PackageManager.GET_META_DATA);
    for (android.content.pm.ApplicationInfo app : packages) {
        if (!(com.devadvance.rootcloak2.Common.isUserApp(app))) {
            continue;
        }
        java.lang.String property = packageNameToProperty(app.packageName);
        java.lang.String command = ("setprop " + property) + " ''";
        Shell.SU.run(command);
        Shell.SU.run(("am force-stop " + (app.packageName)));
    }
}