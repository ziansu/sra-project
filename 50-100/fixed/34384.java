@java.lang.Override
public boolean remove(java.lang.Object o) {
    org.arivu.datastructure.DoublyLinkedStack<T> search = null;
    java.util.concurrent.locks.Lock l = this.cas;
    l.lock();
    search = searchRef(o);
    l.unlock();
    if (search != null) {
        search.remove();
        return true;
    }else
        return false;
    
}