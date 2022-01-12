public in.teramatrix.utilities.service.LocationHandler stop() {
    if (((in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient) != null) && ((in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient.isConnecting()) || (in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient.isConnected()))) {
        LocationServices.FusedLocationApi.removeLocationUpdates(in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient, this);
        in.teramatrix.utilities.service.LocationHandler.mGoogleApiClient.disconnect();
    }
    return this;
}