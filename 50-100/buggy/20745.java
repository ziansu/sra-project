@java.lang.Override
public boolean remove(java.lang.Object o) {
    org.arivu.datastructure.DoublyLinkedList<T> search = null;
    java.util.concurrent.locks.Lock l = this.cas;
    l.lock();
    search = search(o);
    l.unlock();
    if (search != null) {
        search.removeRef();
        return true;
    }else
        return false;
    
}