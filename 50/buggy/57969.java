@java.lang.Override
public void onSkipToPrevious() {
    super.onSkipToPrevious();
    android.util.Log.e("MediaPlayerService", "onSkipToPrevious");
    prevTrack();
    drawNotification("play");
}