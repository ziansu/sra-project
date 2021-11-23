@java.lang.Override
public io.reactivex.Single<com.example.alexander.weatherapp.data.network.models.places.Location> getLocation(java.lang.String placeId) {
    return googlePlacesApi.getDetails(placeId).map(DetailsResponse::getPlace).map(Place::getGeometry).map(Geometry::getLocation);
}