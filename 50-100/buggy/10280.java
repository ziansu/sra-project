@java.lang.Override
public org.apache.hadoop.hbase.Cell next() throws java.io.IOException {
    if ((type) == (MemStoreScanType.UNDEFINED))
        type = MemStoreScanType.USER_SCAN_FORWARD;
    
    assert (type) != (MemStoreScanType.USER_SCAN_BACKWARD);
    for (org.apache.hadoop.hbase.Cell currentCell = forwardHeap.next(); currentCell != null; currentCell = forwardHeap.next()) {
        if ((currentCell.getSequenceId()) > (readPoint))
            continue;
        
        if ((type) == (MemStoreScanType.COMPACT_FORWARD)) {
        }
    }
    return null;
}