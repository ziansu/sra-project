public synchronized void clear() {
    unschedule();
    inbox.clear();
    notify();
}