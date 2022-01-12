private com.google.android.gms.common.api.GoogleApiClient createGoogleApiClient() {
    googleApiClient = new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addApi(Places.GEO_DATA_API).addApi(Places.PLACE_DETECTION_API).build();
    connectGoogleApiClient();
    return googleApiClient;
}