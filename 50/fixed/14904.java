public void takeTurn(Player player, int row, int column) {
    traverseBoard(row, column);
    _endOfTurn = !(_endOfTurn);
    if (_endOfTurn) {
        player.setCanUndo(true);
    }
    notifyPits();
}