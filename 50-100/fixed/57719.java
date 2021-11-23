private void addGeoFencesandAlarm() {
    geofenceStops = new java.util.ArrayList<>();
    geofenceStops.addAll(mAlarmStops);
    for (com.transitangel.transitangel.model.Transit.TrainStop stop : mAlarmStops) {
        int requestCode = (com.transitangel.transitangel.details.DetailsActivity.ALARM_REQUEST_CODE) + (stop.getStopOrder());
        addAlarmToSelectedStops(stop, requestCode);
    }
    addGeoFenceToSelectedStops(trip);
}