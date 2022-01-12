public void analysis(android.graphics.Bitmap image) {
    if (mIsIdle) {
        mIsIdle = false;
        android.os.Message msg = new android.os.Message();
        msg.what = os.ransj.thundership.scenes.ScreenshotAnalysis.MSG_ANALYSIS;
        msg.obj = image;
        mHandler.sendMessage(msg);
    }else {
        image.recycle();
    }
}