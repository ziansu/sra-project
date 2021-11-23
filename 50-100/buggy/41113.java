public boolean checkGameOver() {
    java.util.List<cs451.checkers.checkers_gameplay.Move> playerMoves = getPossibleMoves(playerPieceType);
    java.util.List<cs451.checkers.checkers_gameplay.Move> opponentMoves = getPossibleMoves(opponentPieceType);
    if (playerMoves == null) {
        java.lang.System.out.println("You lost.");
        cp.getGuiHandler().displayLoss("Out of Moves");
        return true;
    }else
        if (opponentMoves == null) {
            java.lang.System.out.println("You won.");
            cp.getGuiHandler().displayWin("Out of Moves");
            return true;
        }else {
            return false;
        }
    
}