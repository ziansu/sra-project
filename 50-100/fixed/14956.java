@java.lang.Override
public java.util.List<com.smartcold.manage.cold.entity.newdb.StorageKeyValue> findByTime(int type, int oid, java.lang.String key, java.util.Date startTime, java.util.Date endTime) {
    com.smartcold.manage.cold.entity.newdb.DeviceObjectMappingEntity deviceEntity = deviceObjectMappingDao.findInfoByTypeOid(type, oid);
    if (deviceEntity != null) {
        return storageDataCollectionDao.findByTime(null, deviceEntity.getDeviceid(), key, startTime, endTime);
    }else {
        return storageKeyValueDao.findByTime(com.smartcold.manage.cold.enums.StorageType.getStorageType(type).getTable(), oid, key, startTime, endTime);
    }
}