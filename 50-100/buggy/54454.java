public int evaluate() {
    int score = 0;
    for (Piece[] row : board) {
        for (Piece piece : row) {
            if (piece != null) {
                if (piece.getColor())
                    score += piece.getValue();
                else
                    score -= piece.getValue();
                
            }
        }
    }
    return score;
}