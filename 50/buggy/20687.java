@java.lang.Override
public void playPart(int position) {
    player.setCurrentTime(position);
    player.play();
}