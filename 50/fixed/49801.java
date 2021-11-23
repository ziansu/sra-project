public void addMovie(se.qxx.jukebox.domain.JukeboxDomain.Movie m) {
    synchronized(_listToDownload) {
        _listToDownload.add(m);
        _listToDownload.notify();
    }
}