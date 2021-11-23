@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    switch (requestCode) {
        case com.tmholen.thecrazynewsmsapp.ContactScreen.PERMISSION_REQUEST_WRITE_CONTACTS :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    displayContactData();
                }else {
                    java.lang.System.out.println("Permission denied");
                }
            }
    }
}