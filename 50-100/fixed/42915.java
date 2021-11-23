public void run() {
    for (int i = 0; i < (idx.length); i++) {
        locks[i].lock();
    }
    for (int i = (idx.length) - 1; i >= 0; i--) {
        locks[i].unlock();
    }
}