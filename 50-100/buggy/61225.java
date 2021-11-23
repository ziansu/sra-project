public void syncAllWindowsAsWindow(final com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder copyLayout, final java.lang.String activityClass) {
    for (com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder mWindowHolder : activitiesStack.get(activityClass)) {
        mWindowHolder.copy(copyLayout);
        mWindowHolder.pushToWindow();
        if ((mOverlay) != null)
            mOverlay.setTitleBarVisibility(((!(isSnapped)) && (!(isMaximized))), mWindowHolder.window);
        
    }
}