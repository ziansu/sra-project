@java.lang.Override
public void onCameraClick() {
    if (cn.jack.album.util.PermissionUtil.checkPermission(this, Manifest.permission.CAMERA)) {
        cameraOutputFile = new java.io.File(cn.jack.album.util.FileUtil.getSystemPicturePath(), (((java.lang.System.currentTimeMillis()) + "_") + (cn.jack.album.AlbumActivity.CAMERA_FILE_NAME)));
        openCamera(cameraOutputFile);
    }else {
        cn.jack.album.util.PermissionUtil.requestPermission(this, Manifest.permission.CAMERA);
        android.widget.Toast.makeText(this, R.string.no_camera_permission, Toast.LENGTH_SHORT).show();
    }
}