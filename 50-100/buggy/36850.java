protected void runOnMainThread(java.lang.Runnable runnable, long delayMillis) {
    if ((!(mConfig.callListenersInMainThread)) || ((android.os.Looper.myLooper()) == (android.os.Looper.getMainLooper()))) {
        runnable.run();
    }else {
        if ((android.R.attr.delay) > 0)
            handler.postDelayed(runnable, android.R.attr.delay);
        else
            handler.post(runnable);
        
    }
}