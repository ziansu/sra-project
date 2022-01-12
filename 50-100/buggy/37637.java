void play(final de.craftolution.craftoplugin.modules.radio.RadioSong song) {
    if ((this.songPlayer) == null) {
        this.songPlayer.destroy();
    }
    this.songPlayer = new com.xxmicloxx.NoteBlockAPI.PositionSongPlayer(song.getRawSong());
    this.songPlayer.setTargetLocation(this.loc);
    this.play();
    this.currentSong = java.util.Optional.of(song);
}