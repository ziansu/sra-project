public static void initializeOthers() {
    android.content.pm.PackageManager pm = com.anna.util.MyApplication.getAppContext().getPackageManager();
    java.util.List<android.content.pm.ApplicationInfo> appsInfos = pm.getInstalledApplications(PackageManager.GET_META_DATA);
    for (android.content.pm.ApplicationInfo info : appsInfos) {
        java.lang.String appLabel = pm.getApplicationLabel(info).toString();
        if (com.anna.util.Module.supportedModuleNames.contains(appLabel)) {
            new com.anna.util.Module(appLabel, info.packageName);
            com.anna.util.Module.moduleNames.add(appLabel);
        }
    }
}