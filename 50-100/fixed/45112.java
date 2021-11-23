public void playNext() {
    if (((this.currentSong) >= 0) && ((this.currentSong) < ((this.songs.size()) - 1))) {
        this.currentSong += 1;
        try {
            player.MusicPlayerService.getInstance().playSong(this.songs.get(this.currentSong).getPath());
        } catch (java.io.FileNotFoundException | javazoom.jl.decoder.JavaLayerException e) {
            e.printStackTrace();
        }
    }
}