protected void runOnMainThread(java.lang.Runnable runnable, long delayMillis) {
    if ((!(mConfig.callListenersInMainThread)) || ((android.os.Looper.myLooper()) == (android.os.Looper.getMainLooper()))) {
        runnable.run();
    }else {
        if (delayMillis > 0)
            handler.postDelayed(runnable, delayMillis);
        else
            handler.post(runnable);
        
    }
}