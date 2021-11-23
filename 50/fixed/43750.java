public com.nnys.bikeable.BikeableRoute getSelectedRoute() {
    if ((selectedRouteIndex) < 0) {
        return null;
    }
    return bikeableRoutes.get(selectedRouteIndex);
}