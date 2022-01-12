public void maximize() {
    for (java.lang.Integer activityClass : activitiesStack.keySet()) {
        maximize(activityClass);
    }
    defaultLayout.setMaximized();
    isMaximized = true;
    if ((mOverlay) != null)
        mOverlay.setTitleBarVisibility(false);
    else
        setOverlayView(ActivityHooks.mCurrentActivity.getWindow());
    
    mOverlay.setWindowBorder();
}