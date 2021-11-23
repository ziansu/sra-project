public void setSongIndex(int index) {
    java.lang.System.out.println(("setSongIndex " + index));
    if (index != (this.songIndex)) {
        this.beatmapIndex = 0;
        setBeatmapIndex(0);
    }
    this.songIndex = index;
    nextSongButton.setEnable((index < ((Resources.songs.size()) - 1)));
    imageReload();
    textReload();
}