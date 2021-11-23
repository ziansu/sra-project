@java.lang.Override
public void play() {
    super.play();
    java.lang.System.err.println(("Playing at " + (getPlaybackSpeed())));
    try {
        if ((movie) != null) {
            movie.setPlaybackSpeed(getPlaybackSpeed());
        }
    } catch (java.lang.Exception e) {
        org.datavyu.plugins.ffmpegplayer.FFmpegViewer.LOGGER.error("Unable to play", e);
    }
}