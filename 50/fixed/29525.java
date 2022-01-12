@java.lang.Override
public void surfaceCreated(final example.videoplayer.SurfaceHolder surfaceHolder) {
    synchronized(this) {
        hasActiveHolder = true;
        ((java.lang.Object) (this)).notifyAll();
    }
    if ((completeListener) != null) {
        completeListener.onComplete(surfaceHolder);
    }
}