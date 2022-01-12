private void NPCMove() {
    if ((hasWon()) == (fields.TIAR.Player.NONE)) {
        util.TIARMove move = getWinningMove();
        if (move == null) {
            move = getMove(fields.TIAR.NPC);
        }
        if ((move == null) && ((maxMoves()) != 9)) {
            java.lang.System.err.println("Couldnt find NPC move for: ");
            java.lang.System.err.println(this);
        }else
            if (move != null) {
                field[move.x][move.y] = fields.TIAR.NPC;
            }
        
    }
}