@java.lang.Override
public boolean onDoubleTap(android.view.MotionEvent e) {
    android.widget.Toast.makeText(context, "onDoubleTap", Toast.LENGTH_SHORT).show();
    return true;
}