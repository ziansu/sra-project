protected void postRunnable(java.lang.Runnable runnable) {
    if (runnable != null) {
        if ((getUseSynchronousMode()) || ((handler) == null)) {
            runnable.run();
        }else {
            handler.post(runnable);
        }
    }
}