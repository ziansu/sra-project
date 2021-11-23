public synchronized int getMissingPiece(java.util.BitSet piecesOffered) {
    int count = pieceQueue.size();
    while ((count--) > 0) {
        int pop = pieceQueue.poll();
        if (piecesOffered.get(pop))
            return pop;
        
        pieceQueue.add(pop);
    } 
    return -1;
}