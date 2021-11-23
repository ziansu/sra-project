public static com.jinjunhang.player.MusicPlayer getInstance(android.content.Context context) {
    if ((com.jinjunhang.player.MusicPlayer.instance) == null) {
        com.jinjunhang.framework.lib.LogHelper.i(com.jinjunhang.player.MusicPlayer.TAG, "create new MusicPlayer");
        com.jinjunhang.player.MusicPlayer.instance = new com.jinjunhang.player.MusicPlayer();
        com.jinjunhang.player.MusicPlayer.instance.context = context;
        com.jinjunhang.player.MusicPlayer.instance.player = new com.jinjunhang.player.playback.exo.player.SimpleExoPlayerWrapper();
        com.jinjunhang.player.MusicPlayer.instance.player.addListener(com.jinjunhang.player.MusicPlayer.instance);
        com.jinjunhang.player.MusicPlayer.instance.player.addListener(com.jinjunhang.player.ExoPlayerNotificationManager.getInstance(context));
    }
    return com.jinjunhang.player.MusicPlayer.instance;
}