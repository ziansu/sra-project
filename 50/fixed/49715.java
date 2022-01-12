public void updateArtists(java.util.ArrayList<de.teyzer.genie.model.Artist> artists) {
    allArtists = artists;
    if (!(searchMode)) {
        displayArtists = artists;
    }
    musicAdapter.update();
}