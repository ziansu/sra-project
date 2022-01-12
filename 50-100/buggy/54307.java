public static int getTrackPosition(java.util.List<com.theah64.soundclouddownloader.models.Track> trackList, final java.lang.String trackId) {
    for (int i = 0; i < (trackList.size()); i++) {
        final com.theah64.soundclouddownloader.models.Track t = trackList.get(i);
        if (t.getId().equals(trackId)) {
            return i;
        }
    }
    throw new java.lang.IllegalArgumentException(("failed to find track id" + trackId));
}