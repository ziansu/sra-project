public void syncAllWindowsAsWindow(final com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder copyLayout) {
    for (java.lang.Integer activityClass : activitiesStack.keySet()) {
        syncAllWindowsAsWindow(copyLayout, activityClass);
    }
    defaultLayout.copy(copyLayout);
}