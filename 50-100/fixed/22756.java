@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<java.lang.Void> task) {
    if (task.isSuccessful()) {
        android.util.Log.d(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, "Stop succeeds");
        mControlOverlayLayout.updateStreamingStatusOnUiThread(false);
        endLiveEvent();
    }else {
        android.util.Log.e(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, ("Stop fails: " + (task.getException())));
    }
}