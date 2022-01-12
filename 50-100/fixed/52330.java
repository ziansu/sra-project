public boolean placePiece(player currentPlayer, player otherPlayer, java.lang.String position) {
    int row = convertIntoNumbers(position).get(0);
    int column = convertIntoNumbers(position).get(1);
    if (isLegalMove(currentPlayer, row, column)) {
        currentPlayer.addTally(1);
        board.get(row).set(column, currentPlayer.getName());
        reversePieces(currentPlayer, otherPlayer, row, column);
        return true;
    }else {
        return false;
    }
}