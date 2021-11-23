@java.lang.Override
public void onDestroy() {
    super.onDestroy();
    android.util.Log.i(com.way.screenshot.TakeScreenshotService.TAG, ((com.way.screenshot.TakeScreenshotService.TAG) + " onDestroy..."));
    if (((mScreenShotBitmap) != null) && (!(mScreenShotBitmap.isRecycled())))
        mScreenShotBitmap.recycle();
    
    mScreenShotBitmap = null;
    if ((mImageReader) != null)
        mImageReader.close();
    
    if ((mProjection) != null)
        mProjection.stop();
    
}