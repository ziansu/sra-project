@java.lang.Override
public void run() {
    synchronized(mScreenLock) {
        if (!(mHasCreatedLcd)) {
            return ;
        }
        android.graphics.Canvas canvas = null;
        try {
            canvas = mSurfaceHolder.lockCanvas();
            if (canvas == null) {
                return ;
            }
            getScreen();
            canvas.drawBitmap(mScreenBitmap, mLcdRect, mScreenRect, mPaint);
        } finally {
            if (canvas != null) {
                mSurfaceHolder.unlockCanvasAndPost(canvas);
            }
        }
    }
}