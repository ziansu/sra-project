@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    if ((com.sample.camera.view.ViewActivity.PERMISSION_REQUEST_CODE_CAMERA) != requestCode) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        return ;
    }
    junit.framework.Assert.assertEquals(grantResults.length, 1);
    junit.framework.Assert.assertEquals(grantResults[0], PackageManager.PERMISSION_GRANTED);
    android.util.Log.i(DBG_TAG, "Runtime Permission Camera Usage Granted");
    com.sample.camera.view.ViewActivity.notifyCameraPermission(((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)));
}