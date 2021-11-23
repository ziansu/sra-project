public void setSongIndex(int index) {
    java.lang.System.out.println(("setSongIndex " + index));
    if (index != (this.songIndex)) {
        this.songIndex = index;
        setBeatmapIndex(0);
    }
    nextSongButton.setEnable((index < ((Resources.songs.size()) - 1)));
    imageReload();
    textReload();
}