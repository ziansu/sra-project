@java.lang.Override
public boolean onTouch(android.view.View v, android.view.MotionEvent event) {
    if ((videoControlsView) != null) {
        if ((videoControlsView.getVisibility()) == (android.view.View.VISIBLE))
            hideControls();
        else
            showControls();
        
    }
    if ((touchListener) != null) {
        return touchListener.onTouch(this, event);
    }
    return false;
}