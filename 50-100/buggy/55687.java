public com.rsharipov.BinaryHeap.Handle add(T item) {
    com.rsharipov.BinaryHeap.Handle handle = new com.rsharipov.BinaryHeap.Handle(((list.size()) - 1));
    list.add(new com.rsharipov.BinaryHeap.DataAndHandle<>(item, handle));
    pullUp(((list.size()) - 1));
    return handle;
}