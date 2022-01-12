@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    switch (requestCode) {
        case 10 :
            {
                if (((grantResults.length) > 0) && ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
                    android.util.Log.d("DEBUG", "permission granted!");
                }else {
                    permissionRequest();
                }
                return ;
            }
    }
}