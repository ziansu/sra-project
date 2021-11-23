public void setBeatmapIndex(int index) {
    this.beatmapIndex = index;
    prevDiffButton.setEnable((index > 0));
    nextDiffButton.setEnable((index < ((Resources.songs.get(this.songIndex).beatmapNames.size()) - 1)));
    textReload();
}