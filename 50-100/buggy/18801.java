public void run() {
    mEtContent.requestFocus();
    long t = android.os.SystemClock.uptimeMillis();
    mEtContent.dispatchTouchEvent(android.view.MotionEvent.obtain(t, t, MotionEvent.ACTION_DOWN, 0, 0, 0));
    mEtContent.dispatchTouchEvent(android.view.MotionEvent.obtain(t, t, MotionEvent.ACTION_UP, 0, 0, 0));
    if ((mContentPosition) < 0)
        mEtContent.setSelection(mEtContent.getText().length());
    
}