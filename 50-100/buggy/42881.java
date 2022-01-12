@java.lang.Override
public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if (((grantResults.length) != 1) || ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        startActivity(requestCode);
    }else {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }
}