@java.lang.Override
public void onGlobalLayout() {
    if ((currentHeader) == null)
        return ;
    
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        currentHeader.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }else {
        currentHeader.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
    getRecyclerParent().requestLayout();
    checkHeaderPositions(visibleHeaders);
}