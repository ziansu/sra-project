@java.lang.Override
public void onGlobalLayout() {
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.JELLY_BEAN)) {
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }else {
        view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
    if ((currentHeader) == null)
        return ;
    
    getRecyclerParent().requestLayout();
    checkHeaderPositions(visibleHeaders);
}