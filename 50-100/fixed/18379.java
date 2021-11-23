@java.lang.Override
public void close() {
    if ((forwardHeap) != null) {
        assert ((type) == (MemStoreScanType.USER_SCAN_FORWARD)) || ((type) == (MemStoreScanType.COMPACT_FORWARD));
        forwardHeap.close();
        forwardHeap = null;
        if ((backwardHeap) != null) {
            backwardHeap.close();
            backwardHeap = null;
        }
    }else
        if ((backwardHeap) != null) {
            assert (type) == (MemStoreScanType.USER_SCAN_BACKWARD);
            backwardHeap.close();
            backwardHeap = null;
        }
    
}