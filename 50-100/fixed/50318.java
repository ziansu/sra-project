protected void refill() {
    if (((mAdapter) == null) || ((getChildCount()) == 0))
        return ;
    
    final int bottomScreenEdge = getScrollY();
    int topScreenEdge = bottomScreenEdge + (getHeight());
    android.util.Log.i(com.appl.library.Carousel.TAG, ("refillt: " + topScreenEdge));
    android.util.Log.i(com.appl.library.Carousel.TAG, ("refillb: " + bottomScreenEdge));
    refillBottomToTop(topScreenEdge);
    refillTopToBottom(bottomScreenEdge);
}