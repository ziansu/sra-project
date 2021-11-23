@java.lang.Override
public void playPart(int position) {
    player.getPlayer().seekTo((position - 1), true);
    player.getPlayer().playVideo();
}