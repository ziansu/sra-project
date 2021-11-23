boolean MoveSong(Song s, int position) {
    int OriginalIndex = 0;
    OriginalIndex = playlist.indexOf(s);
    if ((position < 1) || (position > (totalSongs()))) {
        java.lang.System.out.println("Invalid index.");
        return false;
    }else {
        playlist.addAt(position, s);
        playlist.removeAt(OriginalIndex);
        playlist.set(position, s);
        OriginalIndex = 0;
        return true;
    }
}