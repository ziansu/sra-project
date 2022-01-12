public static void onClickClearButton() {
    if ((group13.ecobuddy2.UserNavigation.stopMarkers) == null) {
        group13.ecobuddy2.UserNavigation.makeALongToast("Cleaning up...");
        return ;
    }
    if ((group13.ecobuddy2.UserNavigation.mDestination) == null) {
        group13.ecobuddy2.UserNavigation.makeALongToast("Cleaning up...");
        return ;
    }
    if (group13.ecobuddy2.UserNavigation.stopMarkers.isEmpty()) {
        group13.ecobuddy2.UserNavigation.makeALongToast("Cleaning up...");
        return ;
    }
    GMap.mMap.clear();
    new group13.ecobuddy2.GMap.DrawMultiRouteTask().execute(group13.ecobuddy2.UserNavigation.mMultiDirections);
    new group13.ecobuddy2.GMap.DrawStopMarkers().execute(group13.ecobuddy2.UserNavigation.stopMarkers);
    group13.ecobuddy2.UserNavigation.makeALongToast("Cleaning up...");
}