@java.lang.Override
public int bytesCount() {
    int sz = n.bytesCount();
    if ((collection) != null) {
        java.util.Iterator<E> itr = collection.iterator();
        while (itr.hasNext()) {
            sz += itr.next().bytesCount();
        } 
    }
    return sz;
}