void setCurrentBoard(com.example.stuart.draughts.Board newBoard, int highlighted) {
    if (inMultiJump) {
        temporaryBoard = newBoard;
        temporaryLegalMoves = temporaryBoard.findMultiJump(highlighted);
    }else {
        currentBoard = newBoard;
        player1Turn = !(player1Turn);
        legalMoves = currentBoard.findMoves(player1Turn, optionalCapture);
        java.lang.System.out.println(com.example.stuart.draughts.Ai.heuristicV2(currentBoard));
    }
}