@java.lang.Override
public org.mwg.struct.ENode root() {
    long addr = parent.addrByIndex(index);
    if ((org.mwg.memory.offheap.primary.OffHeapLongArray.get(addr, org.mwg.memory.offheap.OffHeapEGraph.NODES_INDEX)) > 0) {
        return new org.mwg.memory.offheap.OffHeapENode(parent, this, _graph, 0, org.mwg.memory.offheap.OffHeapEGraph.nodeAddrAt(addr, 0));
    }
    return null;
}