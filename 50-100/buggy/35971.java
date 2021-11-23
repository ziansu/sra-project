public void setElevation(float elevation) {
    boolean needsWrap = elevation > (mElevation);
    mElevation = elevation;
    io.doist.material.elevation.CompatElevationDrawable elevationDrawable = getElevationDrawableWrapper();
    if (elevationDrawable != null) {
        if (needsWrap) {
            unwrap();
        }
        elevationDrawable.setElevation(elevation);
        if (needsWrap) {
            wrap();
        }
    }
}