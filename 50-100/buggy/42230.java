private android.os.Bundle getBundleState() {
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putParcelable(ru.ifmo.geoquiz.MapDialog.BUNDLE_KEY_ORIGINAL_COORDINATES, originalCoordinates);
    bundle.putParcelable(ru.ifmo.geoquiz.MapDialog.BUNDLE_KEY_USER_COORDINATES, userCoordinates);
    bundle.putParcelable(ru.ifmo.geoquiz.MapDialog.BUNDLE_KEY_CAMERA_POSITION, map.getCameraPosition());
    bundle.putBoolean(ru.ifmo.geoquiz.MapDialog.BUNDLE_KEY_IS_STAGE_END, isStageEnd);
    return bundle;
}