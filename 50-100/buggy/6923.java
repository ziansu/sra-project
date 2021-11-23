@java.lang.Override
protected void onSaveInstanceState(android.os.Bundle outState) {
    outState.putShort(slapshotapp.game.tictactoe.SetUpGame.GAME_BOARD_DIMENSION_KEY, _GameBoardDimensions);
    outState.putCharSequence(slapshotapp.game.tictactoe.SetUpGame.PLAYER_ONE_NAME_KEY, _PlayerOne.GetName());
    outState.putCharSequence(slapshotapp.game.tictactoe.SetUpGame.PLAYER_ONE_ICON_KEY, _PlayerOne.GetSymbolValue());
    outState.putCharSequence(slapshotapp.game.tictactoe.SetUpGame.PLAYER_TWO_NAME_KEY, _PlayerTwo.GetName());
    outState.putCharSequence(slapshotapp.game.tictactoe.SetUpGame.PLAYER_TWO_ICON_KEY, _PlayerTwo.GetSymbolValue());
}