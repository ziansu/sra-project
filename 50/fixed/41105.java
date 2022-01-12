public void setSearchMode(boolean searchMode) {
    this.searchMode = searchMode;
    if (!searchMode) {
        displayTracks = allTracks;
        displayAlbums = allAlbums;
        displayArtists = allArtists;
        musicAdapter.update();
    }
}