protected void initiateGeocode(java.lang.String address, int tag) {
    android.content.Intent intent = new android.content.Intent(this, com.getataxi.client.utils.GeocodeIntentService.class);
    intent.putExtra(Constants.GEOCODE_RECEIVER, mResultReceiver);
    intent.putExtra(Constants.GEOCODE_TYPE, Constants.GEOCODE);
    intent.putExtra(Constants.ADDRESS_DATA_EXTRA, address);
    intent.putExtra(Constants.GEOCODE_TAG, tag);
    startService(intent);
}