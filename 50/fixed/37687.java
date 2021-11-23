public void setSelection(int position, java.lang.String selected_song, java.lang.String selected_artist) {
    this.selected_song = selected_song;
    this.selected_artist = selected_artist;
    this.position = position;
    playCurrentSelection();
}