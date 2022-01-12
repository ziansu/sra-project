public void addPossibleMovesTo(com.github.aedge90.nmm.MoveNode parent, com.github.aedge90.nmm.Player player, com.github.aedge90.nmm.GameBoard gameBoard) {
    if ((parent.getChildren().size()) == 0) {
        java.util.LinkedList<com.github.aedge90.nmm.Move> moves = gameBoard.possibleMoves(player);
        for (com.github.aedge90.nmm.Move move : moves) {
            parent.addChild(new com.github.aedge90.nmm.MoveNode(move));
        }
    }
}