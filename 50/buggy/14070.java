private void advance(agersant.polaris.CollectionItem currentItem, int delta) {
    agersant.polaris.CollectionItem newTrack = playbackQueue.getNextTrack(currentItem, delta);
    if (newTrack != null) {
        play(newTrack);
    }
}