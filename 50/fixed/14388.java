private org.apache.hadoop.hbase.client.HTablePool getHTablePool() {
    org.opendaylight.tsdr.persistence.hbase.HBaseDataStore.log.debug("Entering getHTablePool()");
    org.apache.hadoop.hbase.client.HTablePool htablePool = new org.apache.hadoop.hbase.client.HTablePool(org.opendaylight.tsdr.persistence.hbase.HBaseDataStore.getConfiguration(), 1);
    org.opendaylight.tsdr.persistence.hbase.HBaseDataStore.log.debug("Exiting getHTablePool()");
    return htablePool;
}