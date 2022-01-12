@java.lang.Override
protected java.lang.Void doInBackground(java.lang.Void... voids) {
    android.util.Log.d(TAG, "do In background called: ");
    android.util.Log.d(TAG, ("Time is running in do in background: " + (timer.isRunning())));
    while (timer.isRunning()) {
        try {
            publishProgress(timer.getFormattedCurrentTime());
            java.lang.Thread.sleep(1000);
            timer.incrementTimer();
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
        if (isCancelled()) {
            break;
        }
    } 
    return null;
}