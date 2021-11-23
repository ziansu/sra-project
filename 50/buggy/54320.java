@java.lang.Override
public boolean canPause() {
    if ((player) != null) {
        return player.isPlaying();
    }
    return false;
}