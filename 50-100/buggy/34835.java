public int getNumMissing() {
    lock.readLock().lock();
    int missing = 0;
    for (int i = 0; i < (this.numPieces); i++) {
        if (!(this.myBitField.get(i))) {
            missing += 1;
        }
    }
    lock.readLock().unlock();
    return missing;
}