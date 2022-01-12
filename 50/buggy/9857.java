@java.lang.Override
public void onLongPress(android.view.MotionEvent e) {
    android.util.Log.e(com.coralcreations.mylittlescoreapp.ScoreView.MyGestureListener.DEBUG_TAG, "ScoreView onLongPress()");
    ((com.coralcreations.mylittlescoreapp.MainActivity) (getContext())).handle_long_press();
}