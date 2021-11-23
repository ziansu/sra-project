public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((mediaPlayer) != null) {
        mediaPlayer.stop();
        mediaPlayer.dispose();
    }
    playNextSong();
}