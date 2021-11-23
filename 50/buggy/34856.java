public void openSong(studio6ty9.gesamp.Song song) {
    android.content.Intent startSong = new android.content.Intent(this, studio6ty9.gesamp.MusicPlayer.class);
    startSong.putExtra("songId", song.getId());
    startActivity(startSong);
}