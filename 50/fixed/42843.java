public void playPrev() {
    (trackIndex)--;
    if ((trackIndex) < 0) {
        trackIndex = (resourceList.size()) - 1;
    }
    getNextTrack(trackIndex);
}