public void add(T n) {
    heap.add(null);
    int index = (heap.size()) - 1;
    while ((index > 0) && ((heap.get(getParent(index)).compareTo(n)) == 1)) {
        heap.set(index, heap.get(getParent(index)));
        index = getParent(index);
    } 
    heap.set(index, n);
}