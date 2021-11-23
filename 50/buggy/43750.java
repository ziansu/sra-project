public com.nnys.bikeable.BikeableRoute getSelectedRoute() {
    if ((selectedRouteIndex) == (-1))
        return null;
    else
        return bikeableRoutes.get(selectedRouteIndex);
    
}