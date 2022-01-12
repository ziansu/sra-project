public void checkStoragePermissions() {
    int permission = android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE);
    android.util.Log.d("testing", "SO FAR SO GOOD");
    if (permission != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.util.Log.d("testing", "I'm in here!!!");
        android.support.v4.app.ActivityCompat.requestPermissions(this, new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, com.example.mms.doodleexample.MainActivity.REQUEST_EXTERNAL_STORAGE);
    }
}