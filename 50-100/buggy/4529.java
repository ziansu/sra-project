@java.lang.Override
public com.google.maps.model.LatLng makeGeocodeDataFromInfo(java.lang.String address) throws com.google.maps.errors.ApiException, java.io.IOException, java.lang.InterruptedException {
    com.google.maps.GeoApiContext context = new com.google.maps.GeoApiContext().setApiKey(API_KEY);
    final com.google.maps.GeocodingApiRequest req = com.google.maps.GeocodingApi.newRequest(context).address(address);
    com.google.maps.model.GeocodingResult[] results = req.await();
    return results[0].geometry.location;
}