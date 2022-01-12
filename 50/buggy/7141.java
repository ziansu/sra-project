private void resume() {
    if (!(pendingPause.getAndSet(false))) {
        synchronized(lock) {
            lock.notify();
        }
    }else {
    }
}