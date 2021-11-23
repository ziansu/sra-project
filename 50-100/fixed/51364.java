@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception error) {
    if (error instanceof io.straas.android.sdk.streaming.error.StreamException.LiveCountLimitException) {
        mLiveId = ((io.straas.android.sdk.streaming.error.StreamException.LiveCountLimitException) (error)).getLiveId();
        android.util.Log.d(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, ("Existing live event: " + (mLiveId)));
        startStreaming(mLiveId);
    }else {
        android.util.Log.e(io.straas.android.sdk.streaming.demo.MyScreencastSession.TAG, ("Create live event fails: " + error));
        mControlOverlayLayout.updateStreamingStatusOnUiThread(false);
    }
}