public com.zst.xposed.halo.floatingwindow3.tasks.MWTasks.WindowTaskHolderFinderResult findWindowTaskHolder(final com.zst.xposed.halo.floatingwindow3.tasks.Window mWindow) {
    for (java.util.Map.Entry<java.lang.Integer, com.zst.xposed.halo.floatingwindow3.tasks.TaskHolder> mTh : taskStack.entrySet()) {
        java.lang.Integer result = mTh.getValue().findWindowActivityId(mWindow);
        if (result != null)
            return new com.zst.xposed.halo.floatingwindow3.tasks.MWTasks.WindowTaskHolderFinderResult(mTh.getKey(), result);
        
    }
    return null;
}