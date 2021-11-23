private boolean isGoogleMapsInstalled() {
    try {
        android.content.pm.ApplicationInfo info = getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}