private void computeItinerary() {
    if ((mItineraryRenderer) != null) {
        mItineraryRenderer.setDisplayEnabled(false);
    }
    if ((mItineraryProvider) != null) {
        com.insiteo.lbs.common.utils.geometry.ISPosition arrival = new com.insiteo.lbs.common.utils.geometry.ISPosition(mMapView.getMapId(), 20, 20);
        mItineraryProvider.requestItineraryFromCurrentLocation(arrival, true, this, com.insiteo.sampleapp.MapFragment.PMR_ENABLED);
    }
    if (!(com.insiteo.lbs.location.ISLocationProvider.getInstance().isStarted())) {
        startLocation();
    }
}