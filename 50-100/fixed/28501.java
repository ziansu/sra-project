protected void initiateReverseGeocode(android.location.Location location, int tag) {
    android.content.Intent intent = new android.content.Intent(this, com.getataxi.client.utils.GeocodeIntentService.class);
    intent.putExtra(Constants.GEOCODE_RECEIVER, mResultReceiver);
    intent.putExtra(Constants.GEOCODE_TYPE, Constants.REVERSE_GEOCODE);
    intent.putExtra(Constants.LOCATION_DATA_EXTRA, location);
    intent.putExtra(Constants.GEOCODE_TAG, tag);
    startService(intent);
}