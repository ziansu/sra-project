private boolean checkMusicPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        if (android.support.v4.app.ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.READ_EXTERNAL_STORAGE)) {
        }else
            android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ android.Manifest.permission.READ_EXTERNAL_STORAGE }, AlarmConstants.ALARM_PERMISSION_MUSIC);
        
        return false;
    }
    return true;
}