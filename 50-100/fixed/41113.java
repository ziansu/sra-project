public boolean checkGameOver() {
    java.util.List<cs451.checkers.checkers_gameplay.Move> playerMoves = getPossibleMoves(playerPieceType);
    java.util.List<cs451.checkers.checkers_gameplay.Move> opponentMoves = getPossibleMoves(opponentPieceType);
    if (playerMoves == null) {
        cp.getGuiHandler().displayLoss("Out of Moves");
        return true;
    }else
        if (opponentMoves == null) {
            cp.getGuiHandler().displayWin("Out of Moves");
            return true;
        }else {
            return false;
        }
    
}