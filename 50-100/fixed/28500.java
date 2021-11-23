public void requestWritingPermissions(@android.support.annotation.NonNull
android.content.Context context) {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(context, Manifest.permission.WRITE_EXTERNAL_STORAGE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(((android.app.Activity) (context)), new java.lang.String[]{ Manifest.permission.WRITE_EXTERNAL_STORAGE }, 0);
    }
}