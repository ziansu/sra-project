protected void initialiseGestureListener(android.view.View view, int position) {
    view.setOnTouchListener(new com.peekandpop.shalskar.peekandpop.PeekAndPop.PeekAndPopOnTouchListener(position));
    gestureDetector = new android.view.GestureDetector(builder.activity, new com.peekandpop.shalskar.peekandpop.PeekAndPop.GestureListener(view, position));
    gestureDetector.setIsLongpressEnabled(false);
}