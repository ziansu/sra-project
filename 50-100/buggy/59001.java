public static void main(java.lang.String[] args) throws java.io.FileNotFoundException, java.lang.InterruptedException {
    player.Playback playback = player.Playback.getInstance();
    playback.playSong(new player.Song("Test", "songs/bitch_ass_in_kitchen_z.wav"));
    java.lang.Thread.sleep(1000);
    playback.playSong(new player.Song("Test", "songs/alabama_man3.wav"));
}