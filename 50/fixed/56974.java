public void playNext() {
    (songPosn)++;
    if ((songPosn) >= (songs.size()))
        songPosn = 0;
    
    playSong();
}