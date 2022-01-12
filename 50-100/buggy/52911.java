@java.lang.Override
public void run() {
    android.graphics.Canvas c;
    while (mRun) {
        c = null;
        try {
            c = mSurfaceHolder.lockCanvas(null);
            synchronized(mSurfaceHolder) {
                if (c != null) {
                    mView.draw(c);
                }
            }
        } finally {
            if (c != null) {
                mSurfaceHolder.unlockCanvasAndPost(c);
            }
        }
    } 
}