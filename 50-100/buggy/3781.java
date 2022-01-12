public boolean isTargetBlocked(com.chess_game.pieces.Coordinate c2) {
    try {
        if ((this.getColor()) == (com.chess_game.elements.Constants.game_board.getBox(c2).getPiece().getColor())) {
            java.lang.System.out.println("Target is blocked. Try making a different move.");
            return true;
        }else
            return false;
        
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        java.lang.System.out.println("Move is not in range of the board");
        return false;
    }
}