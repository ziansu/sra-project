private racegrid.api.model.RaceTrack track() {
    java.nio.file.Path path = java.nio.file.Paths.get(getClass().getClassLoader().getResource(racegrid.api.service.Engine.TRACK_1_FILE_PATH).getFile());
    return trackRepository.loadTrackFromFile(path);
}