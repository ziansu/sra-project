private void sleepUntilNewPiece() {
    lock.lock();
    if (!(newPiece)) {
        cv.awaitUninterruptibly();
    }
    newPiece = false;
    lock.unlock();
}