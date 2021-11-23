public void actionPerformed(java.awt.event.ActionEvent event) {
    p.play(this);
    Soundboard.getInstance().nowPlaying(this);
}