public static void setInstance() {
    if ((com.app.BoardGame.board_Game_Object) == null)
        com.app.BoardGame.board_Game_Object = new com.app.BoardGame();
    else
        com.app.BoardGame.board_Game_Object = null;
    
}