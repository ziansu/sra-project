protected void wakeAll(net.xy.codebase.concurrent.Sync.Slot nd) {
    if (nd != null)
        for (; nd != null; nd = nd.getNext())
            nd.wake();
        
    
}