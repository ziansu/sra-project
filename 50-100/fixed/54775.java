protected void runOnMainThread(java.lang.Runnable runnable, long delayMillis) {
    if (((mConfig.callListenersInMainThread) && ((android.os.Looper.myLooper()) != (android.os.Looper.getMainLooper()))) || (delayMillis > 0)) {
        if (delayMillis > 0)
            handler.postDelayed(runnable, delayMillis);
        else
            handler.post(runnable);
        
    }else {
        runnable.run();
    }
}