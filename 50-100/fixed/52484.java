@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case 1 :
            if (((grantResults.length) != 0) && ((grantResults[0]) == (android.support.v4.content.PermissionChecker.PERMISSION_GRANTED))) {
                presenter.onGetInfo(true);
            }
            break;
    }
}