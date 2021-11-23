public void clear() {
    unschedule();
    inbox.clear();
    inbox.notify();
}