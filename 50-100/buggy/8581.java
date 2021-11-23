public void add(T newElement) {
    heap.add(newElement);
    int index = (heap.size()) - 1;
    while ((index > 1) && ((heap.get(getParent(index)).compareTo(newElement)) > 0)) {
        heap.set(index, heap.get(getParent(index)));
        index = getParent(index);
        heap.set(index, newElement);
    } 
}