@java.lang.Override
public com.dici.collection.DoublyLinkedList.Cursor<T> listIterator(int index) {
    return new com.dici.collection.DoublyLinkedList.Cursor<>(this, index, defaultWay);
}