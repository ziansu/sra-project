public T extract() {
    T data = heapArr[1];
    indexesMap.remove(heapArr[1]);
    indexesMap.put(heapArr[size()], 1);
    heapArr[1] = heapArr[size()];
    heapArr[size()] = null;
    (size)--;
    heapify(1);
    return data;
}