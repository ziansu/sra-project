private void flashLightOff() {
    try {
        if (getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_FLASH)) {
            hut.hotbaby.MainActivity.camera.stopPreview();
            hut.hotbaby.MainActivity.camera.release();
            hut.hotbaby.MainActivity.camera = null;
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
        android.widget.Toast.makeText(getBaseContext(), "Exception flashLightOff", Toast.LENGTH_SHORT).show();
    }
}