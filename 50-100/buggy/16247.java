@java.lang.Override
public java.util.List<com.smartcold.manage.cold.entity.newdb.StorageKeyValue> findByNums(int type, int oid, java.lang.String key, int nums) {
    com.smartcold.manage.cold.entity.newdb.DeviceObjectMappingEntity deviceEntity = deviceObjectMappingDao.findInfoByTypeOid(type, oid);
    if (deviceEntity != null) {
        return storageDataCollectionDao.findLastNPoint("", deviceEntity.getDeviceid(), key, nums);
    }else {
        java.lang.String table = com.smartcold.manage.cold.enums.StorageType.getStorageType(type).getTable();
        java.util.List<com.smartcold.manage.cold.entity.newdb.StorageKeyValue> result = storageKeyValueDao.findByNums(table, oid, key, nums);
        return result;
    }
}