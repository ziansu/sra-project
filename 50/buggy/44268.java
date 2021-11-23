private void requestResourcePermission() {
    if ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.RECORD_AUDIO , Manifest.permission.MODIFY_AUDIO_SETTINGS , Manifest.permission.WRITE_EXTERNAL_STORAGE }, com.google.sample.echo.MainActivity.AUDIO_ECHO_REQUEST);
    }
}