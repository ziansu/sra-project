@java.lang.Override
public void waypointFileLoaded(org.droidplanner.android.utils.file.IO.MissionReader reader) {
    openedMissionFilename = getSelectedFilename();
    if ((missionProxy) != null) {
        missionProxy.readMissionFromFile(reader);
        gestureMapFragment.getMapFragment().zoomToFit();
    }
}