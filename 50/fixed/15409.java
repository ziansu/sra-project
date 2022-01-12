@java.lang.Override
public void onUpdateListener(float interpolator) {
    mBitmapInfo.setCircleInterpolator(interpolator);
    mBitmapInfo.setStatus(BitmapInfo.PRE_DOWNLOAD);
    mBubbleTextView.setBitmapInfo(mBitmapInfo);
}