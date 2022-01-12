private void startMain() {
    if ((((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.CAMERA)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) && ((android.support.v4.app.ActivityCompat.checkSelfPermission(this, Manifest.permission.VIBRATE)) != (android.content.pm.PackageManager.PERMISSION_GRANTED))) {
        requestPermission(new java.lang.String[]{ Manifest.permission.CAMERA , Manifest.permission.VIBRATE }, com.fosung.barcodescanner.InitActivity.REQUEST_STORAGE_READ_ACCESS_PERMISSION);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.fosung.barcodescanner.QrCodeScanActivity.class);
        startActivity(intent);
        this.finish();
    }
}