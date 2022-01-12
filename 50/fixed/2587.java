@java.lang.Override
public void onTrackSelected(int trackPos) {
    if ((audioPlayerFragment) != null) {
        audioPlayerFragment.setTrack(trackPos);
    }
}