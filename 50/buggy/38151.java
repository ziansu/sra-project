public boolean checkCameraHardware(android.content.Context context) {
    if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        return true;
    }else {
        return false;
    }
}