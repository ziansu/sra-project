public void startOrEndTrip() {
    if ((currentTrip) == null) {
        currentTrip = new maphack.qutcode.navlights.Trip(mMap);
    }else {
        trips.add(currentTrip.end());
        currentTrip = null;
        mMap.clear();
    }
}