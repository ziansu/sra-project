public void pause_song() {
    if (!("".equals(curr_song))) {
        mp.pause();
        isPlaying = false;
    }
}