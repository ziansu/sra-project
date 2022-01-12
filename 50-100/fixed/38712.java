public void startEditMode(int position) {
    if (!(mIsEditModeEnabled))
        return ;
    
    requestDisallowInterceptTouchEvent(true);
    if ((isPostHoneycomb()) && (mWobbleInEditMode))
        startWobbleAnimation();
    
    if (position != (-1)) {
        startDragAtPosition(position);
    }
    mIsEditMode = true;
    if ((mEditModeChangeListener) != null)
        mEditModeChangeListener.onEditModeChanged(true);
    
}