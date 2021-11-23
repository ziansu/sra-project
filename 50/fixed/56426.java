private void updateSessionWithNewTrackInfo(nanodegree.spotifystreamer.models.SpotifyTrack track, int trackIndex) {
    nanodegree.spotifystreamer.models.Session.getSession().track = track;
    nanodegree.spotifystreamer.models.Session.getSession().trackIndex = trackIndex;
}