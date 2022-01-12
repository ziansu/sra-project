@java.lang.Override
public boolean retainAll(java.util.Collection<?> collection) {
    boolean hasRemoved = false;
    com.dici.collection.DoublyLinkedList.Cursor<T> cursor = forwardCursor();
    while (cursor.hasNext()) {
        boolean remove = !(collection.contains(cursor.current().data));
        hasRemoved = hasRemoved || remove;
        if (remove)
            cursor.remove();
        
        cursor.next();
    } 
    return hasRemoved;
}