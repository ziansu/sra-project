private boolean isPlaying() {
    return ((initializer) != null) && (com.frostwire.gui.player.MediaPlayer.instance().isThisBeingPlayed(initializer));
}