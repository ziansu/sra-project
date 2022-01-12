@java.lang.Override
public java.util.List<com.smartcold.manage.cold.entity.newdb.StorageKeyValue> findByNums(com.smartcold.manage.cold.enums.StorageType stype, int oid, java.lang.String key, int nums) {
    com.smartcold.manage.cold.entity.newdb.DeviceObjectMappingEntity deviceEntity = deviceObjectMappingDao.findInfoByTypeOid(stype.getType(), oid);
    if (deviceEntity != null) {
        return storageDataCollectionDao.findLastNPoint("", deviceEntity.getDeviceid(), key, nums);
    }else {
        return storageKeyValueDao.findByNums(stype.getTable(), oid, key, nums);
    }
}