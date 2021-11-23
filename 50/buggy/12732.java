private java.lang.String getClassOfObjectInHeap(jbse.mem.State finalState, long num) {
    final java.util.Map<java.lang.Long, jbse.mem.Objekt> heap = finalState.getHeap();
    final jbse.mem.Objekt o = heap.get(num);
    return o.getType();
}