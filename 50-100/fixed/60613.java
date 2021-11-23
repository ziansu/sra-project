private boolean playNextArchiveHour() {
    if (((mediaSource.show.getUrls().size()) - 1) > (activeSourceNumber)) {
        playArchiveHour(((activeSourceNumber) + 1));
        seek((2 * (mediaSource.show.getHourPaddingTimeMillis())));
        return true;
    }
    return false;
}