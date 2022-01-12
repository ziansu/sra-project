public void copyIntoHub(com.sun.max.vm.heap.Hub hub) {
    int index = hub.referenceMapStartIndex;
    java.util.ListIterator<java.lang.Integer> iterator = indexes.listIterator(indexes.size());
    int lastRefIndex = 0;
    while (iterator.hasPrevious()) {
        int refIndex = iterator.previous();
        com.sun.max.vm.heap.FatalError.check((refIndex >= lastRefIndex), "Reference index in tuple reference maps must be ordered");
        lastRefIndex = refIndex;
        hub.setInt(index, refIndex);
        index++;
    } 
}