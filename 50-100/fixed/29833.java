public void askPermissions() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.CAMERA , android.Manifest.permission.READ_EXTERNAL_STORAGE , android.Manifest.permission.WRITE_EXTERNAL_STORAGE , android.Manifest.permission.RECORD_AUDIO }, 1);
    }else {
        android.util.Log.e("$$$", "###");
    }
}