public java.lang.Integer findWindowActivityId(final com.zst.xposed.halo.floatingwindow3.tasks.Window mWindow) {
    for (java.lang.Integer id : activitiesStack.keySet()) {
        if (isWindowRegistered(mWindow, id))
            return id;
        
    }
    return null;
}