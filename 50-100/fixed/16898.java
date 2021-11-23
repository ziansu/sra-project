@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case WRITE_SD_REQUEST :
            if (((grantResults.length) == 0) || ((grantResults[0]) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                showToast("您拒绝了读写手机存储的权限，某些功能会导致程序出错，请手动允许该权限！");
            }else {
                init();
            }
    }
}