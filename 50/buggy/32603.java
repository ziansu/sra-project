@java.lang.Override
public void onGlobalLayout() {
    getPeekViewOriginalPosition();
    getMaxDrag();
    peekView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
}