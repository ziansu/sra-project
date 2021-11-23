@android.annotation.SuppressLint(value = "WrongCall")
@java.lang.Override
public void run() {
    while (!(mStop.get())) {
        android.graphics.Canvas c = null;
        try {
            c = mSurfaceHolder.lockCanvas();
            synchronized(mSurfaceHolder) {
                mOverlayMod.onDraw(c);
            }
        } finally {
            if (c != null)
                mSurfaceHolder.unlockCanvasAndPost(c);
            
        }
    } 
}