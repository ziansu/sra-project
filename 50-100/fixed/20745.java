@java.lang.Override
public boolean remove(java.lang.Object o) {
    org.arivu.datastructure.DoublyLinkedList<T> search = null;
    java.util.concurrent.locks.Lock l = this.cas;
    l.lock();
    search = search(o);
    if (search != null) {
        search.removeRef();
        l.unlock();
        return true;
    }else {
        l.unlock();
        return false;
    }
}