private void handlePlaybackException(java.lang.Exception exception) {
    emitter.onError(exception);
    haltPlayback();
}