@java.lang.Override
public int bytesCount() {
    int sz = 0;
    java.util.Iterator<E> itr = collection.iterator();
    while (itr.hasNext()) {
        sz += itr.next().bytesCount();
    } 
    return sz + (n.bytesCount());
}