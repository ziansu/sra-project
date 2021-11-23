private void changeState() {
    if (board.hasDrawnLineFor(CellValue.X)) {
        state = GameState.X_WON;
    }else
        if (board.hasDrawnLineFor(CellValue.O)) {
            state = GameState.O_WON;
        }else
            if (isGameDraw()) {
                state = GameState.DRAW;
            }else
                if (state.equals(GameState.X_TURN)) {
                    state = GameState.O_TURN;
                }else {
                    state = GameState.X_TURN;
                }
            
        
    
}