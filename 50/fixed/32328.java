@java.lang.Override
public void onResume() {
    super.onResume();
    hideSystemUi();
    if (((com.google.android.exoplayer2.util.Util.SDK_INT) <= 23) && ((vid_url) != null)) {
        initializePlayer(vid_url);
    }
}