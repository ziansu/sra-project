@java.lang.Override
public com.yahoo.ycsb.db.Status read(java.lang.String table, java.lang.String key, java.util.Set<java.lang.String> fields, java.util.HashMap<java.lang.String, com.yahoo.ycsb.db.ByteIterator> result) {
    com.taobao.tair.Result<com.taobao.tair.DataEntry> rde = tairManager.get(defaultNamespace, key);
    if (rde.getRc().equals(ResultCode.SUCCESS)) {
        return Status.OK;
    }else
        if (rde.getRc().equals(ResultCode.DATANOTEXSITS)) {
            return Status.NOT_FOUND;
        }
    
    return Status.ERROR;
}