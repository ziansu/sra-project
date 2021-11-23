public void maximize(final java.lang.String activityClass) {
    saveLayout();
    for (com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder mWindowHolder : activitiesStack.get(activityClass)) {
        if (mWindowHolder != null) {
            mWindowHolder.setMaximized();
            mWindowHolder.pushToWindow();
        }
    }
}