private boolean checkPermission() {
    if ((android.support.v4.content.ContextCompat.checkSelfPermission(this, com.duyuan.photoview.PhotoActivity.PERMISSIONS[0])) != (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.support.v4.app.ActivityCompat.requestPermissions(this, com.duyuan.photoview.PhotoActivity.PERMISSIONS, com.duyuan.photoview.PhotoActivity.PERMISSION_CODE);
        return false;
    }
    return true;
}