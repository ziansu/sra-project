@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    if ((com.bilibili.boxing.AbsBoxingViewFragment.REQUEST_CODE_PERMISSION) == requestCode) {
        if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            onRequestPermissionSuc(requestCode, permissions, grantResults);
        }else {
            onRequestPermissionError(permissions, new java.lang.SecurityException((("request " + (permissions[0])) + " error.")));
        }
    }
}