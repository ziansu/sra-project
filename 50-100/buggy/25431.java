@android.support.annotation.RequiresPermission(value = Manifest.permission.CAMERA)
public void init(android.content.Context context) {
    if (((isLollipopAndAbove()) && (checkFeature(context, PackageManager.FEATURE_CAMERA_FLASH))) && (checkPermissions(context, Manifest.permission.CAMERA))) {
        postLollipop = new github.nisrulz.lantern.PostLollipop(context);
    }else {
        preLollipop = new github.nisrulz.lantern.PreLollipop();
    }
}