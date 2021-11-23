@java.lang.Override
public org.apache.hadoop.hbase.regionserver.Action addForMemstoreReplication(org.apache.hadoop.hbase.Cell cell, org.apache.hadoop.hbase.regionserver.MemstoreSize memstoreSize) {
    org.apache.hadoop.hbase.regionserver.AbstractMemStore.MemstoreAction action = new org.apache.hadoop.hbase.regionserver.AbstractMemStore.MemstoreAction(((active.getMemStoreLAB()) != null), 1, active, memstoreSize);
    actionListeners.add(action);
    return add(cell, memstoreSize, action);
}