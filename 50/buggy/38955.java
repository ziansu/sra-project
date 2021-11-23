@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    tw.edu.ntu.fortour.ImageUtil.freeBitmap(bm);
    if ((mMediaPlayer) != null)
        mMediaPlayer.release();
    
    try {
        imgUtil.finalize();
    } catch (java.lang.Throwable e) {
    }
}