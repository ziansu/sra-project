protected void updateHandleVisibility(boolean toVisible) {
    if (((requestedHandleVisibility) != null) && ((requestedHandleVisibility) == toVisible)) {
        return ;
    }
    requestedHandleVisibility = toVisible;
    handle.clearAnimation();
    android.util.Log.d(com.devbrackets.android.recyclerext.widget.FastScroll.TAG, ("updating handle visibility " + toVisible));
    handle.startAnimation(getHandleAnimation(handle, toVisible));
}