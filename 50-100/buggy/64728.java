private boolean fireProgressEvent(final int current, final int total) {
    if (((syncLoading) || (isTaskInterrupted())) || (isTaskNotActual()))
        return false;
    
    if ((progressListener) != null) {
        java.lang.Runnable r = new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                progressListener.onProgressUpdate(uri, imageAware.getWrappedView(), current, total);
            }
        };
        com.nostra13.universalimageloader.core.LoadAndDisplayImageTask.runTask(r, false, handler, engine);
    }
    return true;
}