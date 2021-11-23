synchronized void wakeupAll() {
    if (!(continuations.isEmpty())) {
        continuations.remove(0).resume();
    }
    notifyAll();
}