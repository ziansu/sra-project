private void tryToFindRoundCycle() {
    if (foundTrackCycle()) {
        if ((onTrackRecognized) != null) {
            ch.trq.carrera.javapilot.akka.trackanalyzer.Track track = buildTrack();
            onTrackRecognized.onTrackRecognized(track);
        }
        LOGGER.info((("FOUND TRACK CYCLE: " + (((trackSections.size()) - (ignoredTrackSections)) / 2)) + " sections"));
        printTrackSections();
    }
}