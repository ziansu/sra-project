public com.dici.collection.DoublyLinkedList.Cursor<T> backwardCursor() {
    return new com.dici.collection.DoublyLinkedList.Cursor<>(this, defaultWay.opposite());
}