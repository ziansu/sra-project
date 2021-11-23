private void cancelDueToCancellation(java.lang.Exception e) {
    if (cancelled)
        return ;
    
    cancelled = true;
    android.util.Log.d(org.floens.chan.utils.FileCache.TAG, "Cancel due to cancellation");
    purgeOutput();
    finish();
}