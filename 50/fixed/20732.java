protected void initialiseGestureListener(android.view.View view, int position) {
    view.setOnTouchListener(new com.peekandpop.shalskar.peekandpop.PeekAndPop.PeekAndPopOnTouchListener(position));
    gestureDetector.setIsLongpressEnabled(false);
}