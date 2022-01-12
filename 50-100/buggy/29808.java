private void startDetectingAudio() {
    if ((ad) == null) {
        ad = new io.github.fbmediahack.quiethome.AudioDetector(getApplicationContext());
    }
    java.lang.String permission = "android.permission.RECORD_AUDIO";
    int res = checkCallingOrSelfPermission(permission);
    if (res == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        ad.start();
    }else {
        int requestCode = 200;
        if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.M)) {
            requestPermissions(permissions, requestCode);
        }
    }
}