protected boolean addSong(redlibrarian.music.Song item) {
    boolean result = contents.add(item);
    java.util.Collections.sort(this.contents);
    return result;
}