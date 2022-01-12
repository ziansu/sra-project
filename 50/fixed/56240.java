public boolean isShuffle() {
    return ((audioTrackProvider) instanceof fredboat.audio.queue.SimpleTrackProvider) && (((fredboat.audio.queue.SimpleTrackProvider) (audioTrackProvider)).isShuffle());
}