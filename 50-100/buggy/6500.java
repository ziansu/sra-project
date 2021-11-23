public void move(game.board.Board board, game.board.Tile position) throws game.errors.InvalidMoveException {
    if (java.util.Arrays.asList(getMoves(board)).contains(position)) {
        this.position = position;
        position.setPiece(this);
    }else {
        throw new game.errors.InvalidMoveException("This piece can't move there.");
    }
}