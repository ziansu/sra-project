public void clearAllTracks() {
    java.util.List<bigDataTools.bigDataTracker.Track> tracks = getTracks();
    for (bigDataTools.bigDataTracker.Track track : tracks) {
        ij.ImagePlus imp = track.getImp();
        imp.setOverlay(new ij.gui.Overlay());
    }
    tracks.clear();
    getTrackTable().clear();
}