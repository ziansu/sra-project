private float measureOverScale() {
    float maximumAllowedScale = getMaximumAllowedScale();
    float minimumAllowedScale = getMinimumAllowedScale();
    if (maximumAllowedScale < minimumAllowedScale) {
        maximumAllowedScale = minimumAllowedScale;
    }
    if ((mDrawableScale) < minimumAllowedScale) {
        return (mDrawableScale) / minimumAllowedScale;
    }else
        if ((mDrawableScale) > maximumAllowedScale) {
            return (mDrawableScale) / maximumAllowedScale;
        }else {
            return 1;
        }
    
}