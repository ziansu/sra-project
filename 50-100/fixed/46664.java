@java.lang.Override
public boolean retainAll(java.util.Collection<?> collection) {
    boolean hasRemoved = false;
    com.dici.collection.DoublyLinkedList.Cursor<T> cursor = forwardCursor();
    while (cursor.hasNext()) {
        boolean remove = !(collection.contains(cursor.next()));
        hasRemoved = hasRemoved || remove;
        if (remove)
            cursor.remove();
        
    } 
    return hasRemoved;
}