@java.lang.Override
@schicwp.hikeplanner.dal.impl.Transaction
public schicwp.hikeplanner.dal.Hike update(long id, schicwp.hikeplanner.dal.Hike hike) {
    java.lang.Long startLocationId = updateLocation(getStartLocationId(id), hike.getStartLocationEntity());
    java.lang.Long endLocationId = updateLocation(getEndLocationId(id), hike.getEndLocationEntity());
    return getHikeById(updateHike(id, hike, startLocationId, endLocationId));
}