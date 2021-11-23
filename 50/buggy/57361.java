public boolean interestedInPiece(java.lang.Integer piece) {
    lock.readLock().lock();
    boolean interested = !(this.myBitField.get(piece));
    lock.readLock().unlock();
    return interested;
}