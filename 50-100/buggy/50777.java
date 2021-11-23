public boolean hasNext() {
    try {
        this.dqLock.lock();
        if (this.isClosed()) {
            return (dq.size()) > 0;
        }
        return true;
    } finally {
        this.dqLock.unlock();
    }
}