@java.lang.Override
public void handleLocationChange(android.location.Location newLocation) {
    super.handleLocationChange(newLocation);
    setCamera(newLocation, zoomToUserLocation);
    carleton150.edu.carleton.carleton150.MainActivity mainActivity = ((carleton150.edu.carleton.carleton150.MainActivity) (getActivity()));
    if (mainActivity != null) {
        if ((mainActivity.mLastLocation) != null) {
            setUpMapIfNeeded();
            if ((!(onCampus())) && (needToShowOnCampusDialog)) {
                mainActivity.showOnCampusFeatureAlertDialogQuestInProgress();
                needToShowOnCampusDialog = false;
            }
        }
    }
}