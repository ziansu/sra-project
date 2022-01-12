@java.lang.Override
public void playPart(int position) {
    if ((player) != null) {
        player.setCurrentTime(position);
        player.play();
    }
}