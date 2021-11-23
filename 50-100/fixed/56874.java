@java.lang.Override
public void onRequestPermissionsResult(final int requestCode, @android.support.annotation.NonNull
final java.lang.String[] permissions, @android.support.annotation.NonNull
final int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case com.jiacorp.pizzapp.main.MainActivity.REQUEST_PHONE :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    makeCall();
                }else {
                    android.support.design.widget.Snackbar.make(mMainContentView, "Permission denied, cannot make phone call", Snackbar.LENGTH_SHORT).show();
                }
                return ;
            }
    }
}