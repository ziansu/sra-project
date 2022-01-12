@java.lang.Override
public void playPart(int position) {
    if ((player) != null) {
        player.getPlayer().seekTo((position - 1), true);
        player.getPlayer().playVideo();
    }
}