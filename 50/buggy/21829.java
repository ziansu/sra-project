@java.lang.Override
public boolean remove(java.lang.Object o) {
    synchronized(lock) {
        return super.remove(o);
    }
}