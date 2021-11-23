@java.lang.Override
public void onPause() {
    super.onPause();
    mManager.release();
    wycliffeassociates.recordingapp.AudioVisualization.SectionMarkers.clearMarkers(mManager);
}