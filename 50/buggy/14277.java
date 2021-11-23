public java.lang.String readData() {
    rwlock.readLock().lock();
    java.lang.String s = communicator.readData();
    rwlock.readLock().unlock();
    return s;
}