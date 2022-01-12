public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    boolean b = scaleGestureDetector.onTouchEvent(event);
    boolean c = gestureDetector.onTouchEvent(event);
    return (b || c) || (getActivity().onTouchEvent(event));
}