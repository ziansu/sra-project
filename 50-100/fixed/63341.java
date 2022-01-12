public void playSongFromScratch(java.io.File song) {
    theSoundPlayer.stop();
    theSoundPlayer.setInputFile(song);
    theSoundPlayer.play();
    while ((theSoundPlayer.queryDuration().toSeconds()) <= 0) {
    } 
    setupTrackSeekForSong();
    play.setImage(new org.eclipse.swt.graphics.Image(com.attuned.main.AttunedMainWindow.display, java.lang.Class.class.getResourceAsStream("/crystal_icons/pause/gif/32.gif")));
}