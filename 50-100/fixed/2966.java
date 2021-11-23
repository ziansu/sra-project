@java.lang.Override
public void run() {
    while ((mRun) && (set)) {
        c = null;
        try {
            c = SurfaceHolder.lockCanvas(null);
            synchronized(SurfaceHolder) {
                update();
                doDraw(c);
            }
        } finally {
            if ((c) != null) {
                SurfaceHolder.unlockCanvasAndPost(c);
            }
        }
    } 
}