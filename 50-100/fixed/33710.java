@java.lang.Override
public boolean onQueryTextChange(java.lang.String s) {
    if ((songList) != null) {
        if ((s.length()) < 1) {
            songadapter.setFilter(songList);
            return false;
        }
        if (s.isEmpty()) {
            songadapter.setFilter(songList);
            return false;
        }
        filteredSongList = new java.util.ArrayList<>();
        filteredSongList = filterSongs(songList, s);
        songadapter.setFilter(filteredSongList);
        return true;
    }
    return false;
}