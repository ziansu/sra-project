public boolean isShuffle() {
    if (((audioTrackProvider) instanceof fredboat.audio.queue.SimpleTrackProvider) && (((fredboat.audio.queue.SimpleTrackProvider) (audioTrackProvider)).isShuffle())) {
        return true;
    }
    return false;
}