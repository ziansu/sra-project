public boolean isDeviceSupportCamera() {
    if (this.context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)) {
        return true;
    }else {
        return false;
    }
}