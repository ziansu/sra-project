public void updateBatch(org.shaman.dao.SQLBatchVo sqlBatchVo) {
    java.lang.String sql = sqlBatchVo.getSql();
    java.util.List<java.util.Map<java.lang.reflect.Field, java.lang.Object>> sqlSetList = sqlBatchVo.getSqlSetList();
    org.shaman.dao.setter.UpdateBatchSetter updateBatchSetter = new org.shaman.dao.setter.UpdateBatchSetter(sqlSetList);
    super.batchUpdate(sql, updateBatchSetter);
}