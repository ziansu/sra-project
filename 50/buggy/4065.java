public void placeEndMarker(int endTimeMS) {
    wycliffeassociates.recordingapp.AudioVisualization.SectionMarkers.setEndTime(endTimeMS, getWidth(), mManager.getAdjustedDuration(), mManager);
    if (wycliffeassociates.recordingapp.AudioVisualization.SectionMarkers.bothSet()) {
        setWavPlayerSelectionMarkers();
    }
    invalidate();
    redraw();
}