private boolean isPackageInstalled(java.lang.String packageName) {
    java.util.List<android.content.pm.ApplicationInfo> packages;
    android.content.pm.PackageManager pm;
    pm = getContext().getPackageManager();
    packages = pm.getInstalledApplications(0);
    for (android.content.pm.ApplicationInfo packageInfo : packages) {
        if (packageInfo.packageName.equals(packageName))
            return true;
        
    }
    return false;
}