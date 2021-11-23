@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.d(se.anotherhermit.voxels.GLESView.MyGestureListener.DEBUG_TAG, "onLongPress");
    se.anotherhermit.voxels.GLESView.longPress();
    android.widget.Toast.makeText(getContext(), "Toggled Light/Camera", Toast.LENGTH_SHORT).show();
    super.onLongPress(e);
}