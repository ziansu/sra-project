public void opponentTurn(java.util.List<client.Move> moves) {
    for (client.Move move : moves) {
        board.putTile(move);
    }
    java.lang.System.out.println(board.toString());
    board.endTurn();
}