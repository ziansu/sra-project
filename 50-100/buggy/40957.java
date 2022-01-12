@java.lang.Override
public void onRequestPermissionsResult(int requestCode, @android.support.annotation.NonNull
java.lang.String[] permissions, @android.support.annotation.NonNull
int[] grantResults) {
    if (requestCode == (com.svs.hztb.Activities.ContactsActivity.MY_PERMISSIONS_REQUEST_READ_CONTACTS)) {
        if (((grantResults.length) == 1) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
            doPermissionGrantedStuffs();
        }else {
            alertAlert(getString(R.string.permissions_not_granted_read_phone_state));
            finish();
        }
    }
}