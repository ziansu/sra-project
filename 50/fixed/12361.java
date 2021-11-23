public final void newPiece() {
    lock.lock();
    try {
        newPiece = true;
        cv.signal();
    } finally {
        lock.unlock();
    }
}