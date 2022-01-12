protected void postRunnable(java.lang.Runnable runnable) {
    if (runnable != null) {
        if ((getUseSynchronousMode()) || ((handler) == null)) {
            runnable.run();
        }else {
            com.loopj.android.http.Utils.asserts(((handler) != null), "handler should not be null!");
            handler.post(runnable);
        }
    }
}