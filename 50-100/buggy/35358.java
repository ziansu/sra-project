public T extract() {
    T data = heapArr[1];
    heapArr[1] = heapArr[size()];
    heapArr[size()] = null;
    indexesMap.remove(heapArr[1]);
    (size)--;
    heapify(1);
    return data;
}