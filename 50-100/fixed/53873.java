@java.lang.Override
public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubePlayer player, boolean restored) {
    youtubePlayer = player;
    youtubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION);
    if ((videoId) != null) {
        if (restored) {
            youtubePlayer.play();
        }else {
            youtubePlayer.loadVideo(videoId);
        }
    }
}