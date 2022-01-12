@java.lang.Override
public void onInitializationSuccess(com.google.android.youtube.player.YouTubePlayer.Provider provider, com.google.android.youtube.player.YouTubePlayer player, boolean restored) {
    youtubePlayer = player;
    youtubePlayer.setFullscreenControlFlags(YouTubePlayer.FULLSCREEN_FLAG_CONTROL_ORIENTATION);
    youtubePlayer.addFullscreenControlFlag(YouTubePlayer.FULLSCREEN_FLAG_ALWAYS_FULLSCREEN_IN_LANDSCAPE);
    if ((videoId) != null) {
        if (restored) {
            youtubePlayer.play();
        }else {
            youtubePlayer.loadVideo(videoId);
        }
    }
}