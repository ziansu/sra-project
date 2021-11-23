private java.lang.Boolean updateBitfield(java.lang.Integer pieceIndex) {
    if (pieceIndex >= (this.numPieces)) {
        FileHandle.logger.error("invalid piece given {} (max = {}) (self = {})", pieceIndex, this.numPieces, myid);
    }
    synchronized(lock) {
        this.myBitField.set(pieceIndex);
    }
    FileHandle.logger.debug("Updating bitfield to have received piece {} (self={})", pieceIndex, this.myid);
    return checkAvailability();
}