private void init() {
    setLayerType(com.github.clans.fab.LAYER_TYPE_SOFTWARE, null);
    mPaint.setStyle(Paint.Style.FILL);
    mPaint.setColor(mColorNormal);
    mErase.setXfermode(com.github.clans.fab.ExtendedFloatingActionButton.PORTER_DUFF_CLEAR);
    if (!(isInEditMode())) {
        mPaint.setShadowLayer(mShadowRadius, mShadowXOffset, mShadowYOffset, mShadowColor);
    }
    mRadius = (getCircleSize()) / 2;
}