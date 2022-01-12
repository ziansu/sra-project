public boolean isWindowRegistered(final com.zst.xposed.halo.floatingwindow3.tasks.Window mWindow, final java.lang.String activityClass) {
    if (!(activitiesStack.containsKey(activityClass)))
        return false;
    
    for (com.zst.xposed.halo.floatingwindow3.tasks.WindowHolder mWindowHolder : activitiesStack.get(activityClass)) {
        if ((mWindowHolder.window.hashCode()) == (mWindow.hashCode()))
            return true;
        
    }
    return false;
}