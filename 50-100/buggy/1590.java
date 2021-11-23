private void changeState() {
    if (isGameDraw()) {
        state = GameState.DRAW;
    }else
        if (state.equals(GameState.X_TURN)) {
            state = (board.hasDrawnLineFor(CellValue.X)) ? GameState.X_WON : GameState.O_TURN;
        }else {
            state = (board.hasDrawnLineFor(CellValue.O)) ? GameState.O_WON : GameState.X_TURN;
        }
    
}