private cluedo.Hud.STATUS rollAndMove(cluedo.Player player, cluedo.Hud.STATUS status, java.util.Scanner sc) {
    java.lang.System.out.println("/n");
    status = cluedo.Hud.STATUS.MOVE_PIECE;
    displayBoard(player, status);
    movesRemaining = rollDice();
    java.lang.System.out.println(("\nYou rolled a " + (movesRemaining)));
    while ((movesRemaining) != 0) {
        movePiece(player, status, sc);
        (movesRemaining)--;
        displayBoard(player, status);
    } 
    return status;
}