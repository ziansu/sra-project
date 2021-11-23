@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case com.crummy.CompanyFragment.PERMISSION_REQUEST_PHONE :
            if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                makeCall();
            }else {
                android.widget.Toast.makeText(getActivity(), "You must allow phone permissions to make calls from the app", Toast.LENGTH_LONG).show();
            }
    }
}