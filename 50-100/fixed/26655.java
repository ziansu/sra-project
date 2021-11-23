public void onRequestPermissionsResult(int requestCode, java.lang.String[] permissions, int[] grantResults) {
    if ((grantResults != null) || ((grantResults.length) == 0)) {
        requestForPermission = false;
        return ;
    }
    if ((grantResults[0]) == (android.content.pm.PackageManager.PERMISSION_GRANTED)) {
        android.util.Log.i("Codename One", "PERMISSION_GRANTED");
    }else {
        android.widget.Toast.makeText(this, "Permission is denied", Toast.LENGTH_SHORT).show();
    }
    requestForPermission = false;
}