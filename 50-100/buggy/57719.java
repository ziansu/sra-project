private void addGeoFencesandAlarm() {
    geofenceStops = new java.util.ArrayList<>();
    geofenceStops.addAll(mAlarmStops);
    addGeoFenceToSelectedStops(trip);
    for (com.transitangel.transitangel.model.Transit.TrainStop stop : mAlarmStops) {
        int requestCode = (com.transitangel.transitangel.details.DetailsActivity.ALARM_REQUEST_CODE) + (stop.getStopOrder());
        addAlarmToSelectedStops(stop, requestCode);
    }
}