public static void start() {
    com.app.BoardGame.setInstance();
    com.app.BoardGame.board_Game_Object = com.app.BoardGame.getInstance();
    com.app.BoardGame.startGame();
}