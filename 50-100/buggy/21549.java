private boolean nextMove(chess.Position from) {
    if (this.board.allVisited())
        return true;
    
    for (chess.Position p : this.availableFrom(from)) {
        this.board.visit(p);
        if (nextMove(p)) {
            return true;
        }else {
            board.stepBack();
            return false;
        }
    }
    board.stepBack();
    return false;
}