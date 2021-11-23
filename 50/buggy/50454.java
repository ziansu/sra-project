@java.lang.Override
public void waypointFileLoaded(org.droidplanner.android.utils.file.IO.MissionReader reader) {
    openedMissionFilename = getSelectedFilename();
    missionProxy.readMissionFromFile(reader);
    gestureMapFragment.getMapFragment().zoomToFit();
}