public void actionPerformed(java.awt.event.ActionEvent e) {
    if ((mediaPlayer) != null) {
        mediaPlayer.dispose();
    }
    playNextSong();
}