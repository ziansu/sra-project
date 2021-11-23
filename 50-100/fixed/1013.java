@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    float x = e.getX();
    float y = e.getY();
    if (XDebug.LOG)
        android.util.Log.d(com.minio.io.alice.MainActivity.TAG, (((("Tapped at: (" + x) + ",") + y) + ")"));
    
    swapCamera();
    return true;
}