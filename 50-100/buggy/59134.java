public in.teramatrix.utilities.service.LocationHandler stop() {
    if ((in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient) != null) {
        LocationServices.FusedLocationApi.removeLocationUpdates(in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient, this);
        if ((in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient.isConnecting()) || (in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient.isConnected()))
            in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient.disconnect();
        
    }
    return this;
}