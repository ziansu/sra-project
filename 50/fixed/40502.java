public void playNext() {
    if ((++(trackIndex)) >= (resourceList.size())) {
        trackIndex = 0;
    }
    getNextTrack(trackIndex);
}