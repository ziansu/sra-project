protected void checkForPermissions() {
    try {
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            if (((checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) && ((checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                android.content.Intent dialogIntent = new android.content.Intent(getBaseContext(), com.hamsiapps.hamsiwallpaperslideshow.SettingsActivity.class);
                dialogIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                getApplication().startActivity(dialogIntent);
            }
        }
    } catch (java.lang.Exception ex) {
        android.util.Log.e(com.hamsiapps.hamsiwallpaperslideshow.HamsiWallpaperSlideshow.TAG, "Got exception ", ex);
    }
}