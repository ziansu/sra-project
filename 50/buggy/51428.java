@java.lang.Override
public void onTouchEvent(android.support.v7.widget.RecyclerView rv, android.view.MotionEvent e) {
    android.util.Log.e(com.chad.library.adapter.base.listener.SimpleClickListener.TAG, "onTouchEvent: ");
    mGestureDetector.onTouchEvent(e);
}