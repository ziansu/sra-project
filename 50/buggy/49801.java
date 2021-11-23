public void addMovie(se.qxx.jukebox.domain.JukeboxDomain.Movie m) {
    synchronized(this) {
        _listToDownload.add(m);
        this.notify();
    }
}