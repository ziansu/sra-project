public void playNext() {
    this.currentSong += 1;
    player.MusicPlayerService.getInstance().stop();
    if (((this.currentSong) >= 0) && ((this.currentSong) < (this.songs.size()))) {
        try {
            player.MusicPlayerService.getInstance().playSong(this.songs.get(this.currentSong).getPath());
        } catch (java.io.FileNotFoundException | javazoom.jl.decoder.JavaLayerException e) {
            e.printStackTrace();
        }
    }
}