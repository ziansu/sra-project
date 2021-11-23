@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onLongPress");
    se.anotherhermit.voxels.GLESView.longPress();
    super.onLongPress(e);
}