public android.graphics.RectF getGridClippingRect() {
    mGridClippingRect.set(mViewPortHandler.getContentRect());
    mGridClippingRect.inset(((-(mAxis.getGridLineWidth())) / 2.0F), 0.0F);
    return mGridClippingRect;
}