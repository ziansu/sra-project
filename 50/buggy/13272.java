@java.lang.Override
public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubePlayer youTubePlayer, boolean b) {
    if (!b) {
        maximbravo.com.topflix.TrailerActivity.youPlayer = youTubePlayer;
    }
}