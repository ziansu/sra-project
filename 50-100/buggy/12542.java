public void stopStreaming() {
    mStreamManager.stopStreaming().addOnCompleteListener(new com.google.android.gms.tasks.OnCompleteListener<java.lang.Void>() {
        @java.lang.Override
        public void onComplete(@android.support.annotation.NonNull
        com.google.android.gms.tasks.Task<java.lang.Void> task) {
            if (task.isSuccessful()) {
                android.util.Log.d(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, "Stop succeeds");
                mControlOverlayLayout.updateStreamingStatusOnUiThread(mMainThreadHandler, false);
                endLiveEvent();
            }else {
                android.util.Log.e(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, ("Stop fails: " + (task.getException())));
            }
        }
    });
}