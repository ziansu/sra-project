public void nextSong() {
    if (isEmpty()) {
        return ;
    }
    (selectedTrack)++;
    if ((selectedTrack) >= 12) {
        selectedTrack = 0;
    }
    while ((contents.get(selectedTrack).isEmpty()) || ((contents.get(selectedTrack)) == null)) {
        (selectedTrack)++;
        if ((selectedTrack) >= 12) {
            selectedTrack = 0;
        }
    } 
}