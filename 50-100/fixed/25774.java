public void move() {
    if ((Checkers.gameOver) == true)
        return ;
    
    java.lang.System.out.println("------------------------------------");
    Piece current = this.findMoves();
    if (null != current) {
        makeMove(((Piece[]) (current.moves.get(0))));
    }else {
        java.lang.System.out.println(((this) + " has run out of moves!"));
        Checkers.gameOver = true;
    }
    Checkers.printBoard();
}