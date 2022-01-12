public void init(android.content.Context context) {
    if ((checkFeature(context, PackageManager.FEATURE_CAMERA_FLASH)) && (checkPermissions(context, Manifest.permission.CAMERA))) {
        if (isLollipopAndAbove()) {
            postLollipop = new github.nisrulz.lantern.PostLollipop(context);
        }else {
            preLollipop = new github.nisrulz.lantern.PreLollipop();
        }
    }
}