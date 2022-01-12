private boolean advance(agersant.polaris.CollectionItem currentItem, int delta) {
    agersant.polaris.CollectionItem newTrack = playbackQueue.getNextTrack(currentItem, delta);
    if (newTrack != null) {
        play(newTrack);
        return true;
    }
    return false;
}