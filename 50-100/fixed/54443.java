private java.lang.Long updateLocation(java.lang.Long locationId, schicwp.hikeplanner.dal.Location locationEntity) {
    if (locationEntity == null) {
        if (locationId != null) {
            locationDao.delete(locationId);
        }
        return null;
    }else {
        if (locationId != null) {
            locationDao.updateLocation(locationId, locationEntity);
            return locationId;
        }else {
            return locationDao.insertLocationAndGetId(locationEntity);
        }
    }
}