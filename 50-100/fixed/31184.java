private boolean isPackageInstalled(java.lang.String packageName) {
    java.util.List<android.content.pm.ApplicationInfo> packages;
    android.content.pm.PackageManager pm;
    pm = getContext().getPackageManager();
    packages = pm.getInstalledApplications(0);
    int i = 0;
    while (i < (packages.size())) {
        android.content.pm.ApplicationInfo packageInfo = packages.get(i);
        if (!(packageInfo.packageName.equals(packageName))) {
            i++;
        }else {
            return true;
        }
    } 
    return false;
}