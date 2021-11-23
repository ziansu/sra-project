@java.lang.Override
public rx.Observable<me.alwx.places.data.models.Geodata> call(me.alwx.places.data.models.gson.GeocodeResponse resp) {
    localDataSource.removeGeodata();
    me.alwx.places.data.models.Geodata geodata = me.alwx.places.data.models.Geodata.builder().setId(place.id()).setLatitude(resp.getLat()).setLongitude(resp.getLng()).setAddress(addressStr).build();
    localDataSource.saveGeodata(geodata);
    cachedGeodata.put(place.address().asString(), geodata);
    return rx.Observable.just(geodata);
}