@java.lang.Override
public void seekTo(int time) {
    videoService.getMediaPlayer().setTime(time);
}