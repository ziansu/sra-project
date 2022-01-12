@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.String> task) {
    if (task.isSuccessful()) {
        android.util.Log.d(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, "Start streaming succeeds");
        mControlOverlayLayout.updateStreamingStatusOnUiThread(mMainThreadHandler, true);
        mStreamingStartTimeMillis = android.os.SystemClock.elapsedRealtime();
        mMainThreadHandler.post(mUpdateStreamingTimeRunnable);
    }else {
        android.util.Log.e(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, ("Start streaming fails " + (task.getException())));
        mControlOverlayLayout.updateStreamingStatusOnUiThread(mMainThreadHandler, false);
    }
}