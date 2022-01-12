@java.lang.Override
public org.apache.hadoop.hive.metastore.api.SFile getSFile(java.lang.String devid, java.lang.String location) throws org.apache.hadoop.hive.metastore.api.MetaException {
    try {
        org.apache.hadoop.hive.metastore.api.SFileLocation sfl = getSFileLocation(devid, location);
        return getSFile(sfl.getFid());
    } catch (java.lang.Exception e) {
        org.apache.hadoop.hive.metastore.newms.RawStoreImp.LOG.error(e, e);
        throw new org.apache.hadoop.hive.metastore.api.MetaException(e.getMessage());
    }
}