@java.lang.Override
public android.view.View getInfoContents(com.google.android.gms.maps.model.Marker marker) {
    android.view.View returnView = null;
    org.opentripplanner.routing.bike_rental.BikeRentalStation station = bikeStationsInfo.getBikeStationOnMarker(marker);
    if (station.isFloatingBike) {
        setBikeName(floatingBikeInfoWindowView, station.name);
        returnView = floatingBikeInfoWindowView;
    }else {
        setBikeName(bikeStationInfoWindowView, station.name);
        setNumberBikesAvailable(station.bikesAvailable);
        setNumberSpacesAvailable(station.spacesAvailable);
        returnView = bikeStationInfoWindowView;
    }
    return returnView;
}