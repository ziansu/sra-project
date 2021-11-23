public void playPrev() {
    if (shuffle) {
        int newSong = songPosn;
        while (newSong == (songPosn)) {
            newSong = rand.nextInt(songs.size());
        } 
        songPosn = newSong;
    }else {
        (songPosn)--;
        if ((songPosn) == 0) {
            songPosn = (songs.size()) - 1;
        }
    }
    playSong();
}