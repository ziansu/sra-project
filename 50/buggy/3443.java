@java.lang.Override
public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
    synchronized(this) {
        frameAvailable = true;
    }
}