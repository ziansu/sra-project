@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    de.greenrobot.event.EventBus.getDefault().unregister(this);
    Ø = $missing$;
    if ((mFinalPix) != null) {
        mFinalPix.recycle();
        mFinalPix = null;
    }
    android.graphics.drawable.BitmapDrawable bd = ((android.graphics.drawable.BitmapDrawable) (mImageView.getDrawable()));
    if (bd != null) {
        bd.getBitmap().recycle();
    }
}