@java.lang.Override
public void onAdError(com.google.ads.interactivemedia.v3.api.AdErrorEvent adErrorEvent) {
    android.util.Log.e(TAG, ("Ad Error: " + (adErrorEvent.getError().getMessage())));
    if ((mVideoPlayer) != null) {
        mVideoPlayer.setPlayWhenReady(true);
    }
}