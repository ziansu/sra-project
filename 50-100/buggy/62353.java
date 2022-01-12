public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    boolean b = scaleGestureDetector.onTouchEvent(event);
    boolean c = gestureDetector.onTouchEvent(event);
    java.lang.System.out.println(((("ON TOUCH EVENT: b: " + b) + " c: ") + c));
    return (b || c) || (getActivity().onTouchEvent(event));
}