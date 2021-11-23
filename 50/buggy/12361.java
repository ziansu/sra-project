public final void newPiece() {
    lock.lock();
    newPiece = true;
    cv.signal();
    lock.unlock();
}