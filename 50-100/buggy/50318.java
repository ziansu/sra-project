protected void refill() {
    if (((mAdapter) == null) || ((getChildCount()) == 0))
        return ;
    
    final int topScreenEdge = ((getScrollY()) == 0) ? getHeight() : getScrollY();
    int bottomScreenEdge = topScreenEdge - (getHeight());
    android.util.Log.i(com.appl.library.Carousel.TAG, ("refillt: " + topScreenEdge));
    android.util.Log.i(com.appl.library.Carousel.TAG, ("refillb: " + bottomScreenEdge));
    refillBottomToTop(topScreenEdge);
    refillTopToBottom(bottomScreenEdge);
}