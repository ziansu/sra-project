@java.lang.Override
protected void onAttachedToWindow() {
    android.util.Log.d(com.yoai.reactnative.media.player.ReactMediaPlayerView.TAG, "onAttachedToWindow...");
    super.onAttachedToWindow();
    if ((getContext()) instanceof com.facebook.react.bridge.ReactContext) {
        ((com.facebook.react.bridge.ReactContext) (getContext())).addLifecycleEventListener(this);
    }
    initPlayerControllerIfNeeded();
}