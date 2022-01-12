@java.lang.Override
public void run() {
    try {
        android.graphics.Bitmap bm = android.graphics.BitmapFactory.decodeResource(getResources(), com.norman.apps.ImageUtil.getImage(com.norman.apps.WatchActivity.PICS[iPicIndex]));
        mImageView.setImageBitmap(bm);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    } finally {
        mHandler.removeCallbacks(mUpdateImageView);
    }
}