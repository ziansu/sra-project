@java.lang.Override
public void onStarted() {
    super.onStarted();
    android.util.Log.d(com.felkertech.cumulustv.tv.CumulusTvTifService.TAG, "Video available");
    stillTuning = false;
    notifyVideoAvailable();
    setOverlayViewEnabled(false);
    if (jsonChannel.isAudioOnly()) {
        setOverlayViewEnabled(true);
    }
}