@java.lang.Override
protected com.nordman.big.myfellowcompass.backend.geoBeanApi.model.GeoBean doInBackground(java.lang.String... params) {
    if ((params[0]) == null)
        return null;
    
    java.lang.Long id = java.lang.Long.parseLong(params[0]);
    try {
        return com.nordman.big.myfellowcompass.GeoEndpointManager.geoApiService.get(id).execute();
    } catch (java.io.IOException e) {
        errorMessage = e.getMessage();
        return null;
    }
}