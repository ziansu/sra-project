@java.lang.Override
public org.apache.hadoop.hbase.regionserver.Action addForMemstoreReplication(java.util.List<org.apache.hadoop.hbase.Cell> cells, org.apache.hadoop.hbase.regionserver.MemstoreSize memstoreSize) {
    org.apache.hadoop.hbase.regionserver.AbstractMemStore.MemstoreAction action = new org.apache.hadoop.hbase.regionserver.AbstractMemStore.MemstoreAction(((active.getMemStoreLAB()) != null), cells.size(), active, memstoreSize);
    actionListeners.put(action, true);
    for (org.apache.hadoop.hbase.Cell cell : cells) {
        add(cell, memstoreSize, action);
    }
    return action;
}