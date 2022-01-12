public retrofit2.Call<com.mapbox.services.geocoding.v5.models.GeocodingResponse> getCall() {
    if ((call) != null)
        return call;
    
    call = getService().getCall(getHeaderUserAgent(), builder.getMode(), builder.getQuery(), builder.getAccessToken(), builder.getCountry(), builder.getProximity(), builder.getGeocodingTypes(), builder.getAutocomplete(), builder.getBbox());
    return call;
}