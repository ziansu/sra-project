private racegrid.api.model.RaceTrack track() {
    return trackRepository.loadTrackFromFile(racegrid.api.service.Engine.TRACK_1_FILE_PATH);
}