public void move(game.board.Board board, game.board.Tile position) throws game.errors.InvalidMoveException {
    if ((getMoves(board).contains(position)) || (position.equals(this.position))) {
        board.getTile(this.position.getLocation()).setPiece(null);
        this.position = position;
        position.setPiece(this);
    }else {
        throw new game.errors.InvalidMoveException("This piece can't move there.");
    }
}