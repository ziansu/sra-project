public boolean addQueue(java.lang.String name, final isac.gameoflife.MessageListener listener) {
    if (addQueue(name)) {
        lock.lock();
        addListener(listener, queue.get(name), name, name);
        lock.unlock();
        return true;
    }
    return false;
}