private boolean isGoogleMapsInstalled() {
    try {
        getPackageManager().getApplicationInfo("com.google.android.apps.maps", 0);
        return true;
    } catch (android.content.pm.PackageManager e) {
        return false;
    }
}