public boolean updatePiecePriority(Piece piece) {
    if (queue.remove(piece))
        return queue.add(piece);
    
    return false;
}