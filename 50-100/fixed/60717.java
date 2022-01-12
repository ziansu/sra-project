@java.lang.Override
public void onRequestPermissionsResult(final int requestCode, @android.support.annotation.NonNull
final java.lang.String[] permissions, @android.support.annotation.NonNull
final int[] grantResults) {
    if ((permissionRequestCallback) == null) {
        return ;
    }
    if (requestCode != (com.lytefast.flexinput.fragment.PermissionsFragment.PERMISSIONS_REQUEST_CODE)) {
        permissionRequestCallback = null;
        return ;
    }
    if (areAllPermissionsGranted(grantResults)) {
        permissionRequestCallback.granted();
    }else {
        permissionRequestCallback.denied();
    }
    permissionRequestCallback = null;
}