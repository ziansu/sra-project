public static boolean checkMoves(java.lang.String coord) {
    int[] pegLoc = gameMechanics.MovePiece.parseStringToLoc(coord);
    int possibleMoves = 0;
    gameMechanics.MovePiece.selected[0] = pegLoc[0];
    gameMechanics.MovePiece.selected[1] = pegLoc[1];
    possibleMoves = gameMechanics.MovePiece.checkPosMoves(pegLoc, true);
    java.lang.System.out.println(("Amount of possible moves for selected peg: " + possibleMoves));
    if (possibleMoves > 0)
        return true;
    else
        return false;
    
}