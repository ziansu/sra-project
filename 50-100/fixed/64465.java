public int getStatusByte() {
    int statusByte = 0;
    java.util.Optional<java.lang.Integer> index = indexStatusMediaRemoteService.getPlayingIndex();
    if (index.isPresent()) {
        statusByte = (pow(2, statusByteConfiguration.getPlayerRunningBit())) + (java.lang.Math.min(index.get(), de.burrotinto.burroPlayer.adapter.rs232.executors.StatusExecutor.MAX_MOVIE_VALUE));
        statusByte += (indexStatusMediaRemoteService.isPaused()) ? pow(2, statusByteConfiguration.getPlayerPausedBit()) : 0;
    }
    return statusByte;
}