public static boolean checkPlayersTiles(java.lang.String board, int player, int value, int numOfValues) {
    java.lang.String tiles = game.manger.SaveTheIslandGame.Board.getPlayersTiles(player, board);
    int count = 0;
    for (int i = 0; i < 5; i++) {
        if ((java.lang.Integer.parseInt(tiles.substring(i, (i + 1)))) == value) {
            count++;
        }
    }
    return count == value;
}