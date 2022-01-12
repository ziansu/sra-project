public boolean hasNext() {
    this.dqLock.lock();
    try {
        if (this.isClosed()) {
            return (dq.size()) > 0;
        }
        return true;
    } finally {
        this.dqLock.unlock();
    }
}