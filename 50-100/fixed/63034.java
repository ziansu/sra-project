public void updateSearchString(java.lang.String text) {
    switch (displayMode) {
        case de.teyzer.genie.ui.fragments.MusicListFragment.MODE_TITLE :
            displayTracks = findTracks(text);
            break;
        case de.teyzer.genie.ui.fragments.MusicListFragment.MODE_ALBUM :
            displayAlbums = findAlbums(text);
            break;
        case de.teyzer.genie.ui.fragments.MusicListFragment.MODE_ARTIST :
            displayArtists = findArtists(text);
            break;
    }
    musicAdapter.update();
}