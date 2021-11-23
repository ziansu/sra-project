public void removeAddress(final java.lang.String address) {
    if (address != null) {
        MUTEX_LOCK.lock();
        if (hhDatabase.get(address).isEmpty())
            hhDatabase.remove(address);
        
        MUTEX_LOCK.unlock();
    }
}