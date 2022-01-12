public edu.Groove9.TunesMaster.playlist.domain.model.Song getLastSong() {
    if ((songs.isEmpty()) || ((currentSong) == null)) {
        return null;
    }
    int currentIndex = songs.indexOf(currentSong);
    int firstIndex = 0;
    if (currentIndex == firstIndex) {
        int lastIndex = (songs.size()) - 1;
        currentSong = songs.get(lastIndex);
    }else {
        currentSong = songs.get((--currentIndex));
    }
    return currentSong;
}