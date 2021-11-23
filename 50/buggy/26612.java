public void addList(java.util.ArrayList<grooveberryserver.audiofile.AudioFile> playlist) {
    if (this.isEmpty()) {
        this.currentTrack = playlist.get(0);
        this.currentTrackIndex = 0;
    }
    this.queue.addAll(playlist);
}