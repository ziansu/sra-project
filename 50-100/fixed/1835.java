public raspimediacenter.Data.Models.Music.MusicAlbumContainer.MusicAlbum scraperParseAlbum(java.lang.String jsonURI, raspimediacenter.Data.Models.Music.MusicTrackContainer.MusicTrack track, int index) {
    jsonURI = constructGetInfoURI("album", track.track.album.getMBID());
    album = parser.parseRemoteAlbum(jsonURI);
    if ((album) != null) {
        if ((album.wiki) != null) {
            album.wiki.setSummary(trimString(album.wiki.getSummary(), 0, "<a"));
        }
        parser.appendToAlbumList(album);
    }
    return album;
}