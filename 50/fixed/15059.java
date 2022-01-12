@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onDoubleTap");
    se.anotherhermit.voxels.GLESView.doubleTap();
    return super.onDoubleTap(e);
}