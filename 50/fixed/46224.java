@java.lang.Override
public void onPause() {
    super.onPause();
    if (((videosAdapter) != null) && ((com.google.android.exoplayer2.util.Util.SDK_INT) <= 23)) {
        videosAdapter.releasePlayers();
    }
}