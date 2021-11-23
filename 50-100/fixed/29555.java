@java.lang.Override
public void add(E e, double p) throws java.lang.IllegalArgumentException {
    if (map.containsKey(e)) {
        throw new java.lang.IllegalArgumentException("e is already in priority queue");
    }
    b.add(e);
    (size)++;
    map.put(e, new MinHeap.EInfo(b.indexOf(e), p));
    bubbleUp(((size) - 1));
}