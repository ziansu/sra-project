private void clearPrev() {
    errTrack = null;
    workingTrack = null;
    shifts = null;
    updater = null;
    pass = 0;
    Forces = params.getForces(pass);
    diverged = false;
    BTPs = new java.util.Vector<TrackExtractionJava.BackboneTrackPoint>();
    clipEnds = false;
    if (params.storeEnergies) {
        initEnergyProfiles();
    }
}