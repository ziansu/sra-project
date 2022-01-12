@java.lang.Override
public org.mwg.struct.ENode node(int index) {
    long addr = container.addrByIndex(index);
    long nodeAddr = org.mwg.memory.offheap.OffHeapERelation.nodeAddrAt(addr, index);
    long nodeId = org.mwg.memory.offheap.OffHeapENode.getId(nodeAddr);
    return new org.mwg.memory.offheap.OffHeapENode(container, eGraph, graph, nodeId, nodeAddr);
}