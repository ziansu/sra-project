private java.lang.Boolean updateBitfield(java.lang.Integer pieceIndex) {
    lock.writeLock().lock();
    if (pieceIndex >= (this.numPieces)) {
        FileHandle.logger.error("invalid piece given {} (max = {}) (self = {})", pieceIndex, this.numPieces, myid);
    }
    this.myBitField.set(pieceIndex);
    FileHandle.logger.debug("Updating bitfield to have received piece {} (self={})", pieceIndex, this.myid);
    lock.writeLock().unlock();
    return checkAvailability();
}