public Piece dequeue() {
    Piece rarestPiece = null;
    try {
        rarestPiece = queue.take();
    } catch (java.lang.InterruptedException e) {
    }
    return rarestPiece;
}