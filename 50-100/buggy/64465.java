public int getStatusByte() {
    int statusByte = 0;
    java.util.Optional<java.lang.Integer> index = indexStatusMediaRemoteService.getPlayingIndex();
    if (index.isPresent()) {
        statusByte = java.lang.Math.min(((index.get()) + (pow(2, statusByteConfiguration.getPlayerRunningBit()))), de.burrotinto.burroPlayer.adapter.rs232.executors.StatusExecutor.MAX_MOVIE_VALUE);
        statusByte += (indexStatusMediaRemoteService.isPaused()) ? pow(2, statusByteConfiguration.getPlayerPausedBit()) : 0;
    }
    return statusByte;
}