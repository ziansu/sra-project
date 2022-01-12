public void previousSong() {
    if (isEmpty()) {
        return ;
    }
    (selectedTrack)--;
    if ((selectedTrack) <= (-1)) {
        selectedTrack = 11;
    }
    while ((contents.get(selectedTrack).isEmpty()) || ((contents.get(selectedTrack)) == null)) {
        (selectedTrack)--;
        if ((selectedTrack) <= 0) {
            selectedTrack = 11;
        }
    } 
}