public static void setBoard() {
    for (int i = 0; i < (GameBase.pitNum); i++) {
        GameBase.board[i] = GameBase.stoneNum;
        GameBase.board[((2 * (GameBase.pitNum)) - i)] = GameBase.stoneNum;
    }
    java.lang.System.out.println(GameBase.board[(2 * (GameBase.pitNum))]);
    GameBase.board[GameBase.pitNum] = 0;
    GameBase.board[((2 * (GameBase.pitNum)) + 1)] = 0;
}