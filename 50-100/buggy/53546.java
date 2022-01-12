@java.lang.Override
public com.theaigames.game.player.AbstractPlayer getWinner() {
    int winner = mMacroField.getWinner();
    if ((mGameOverByPlayerErrorPlayerId) > 0) {
        for (com.theaigames.uttt.player.Player player : mPlayers) {
            if ((player.getId()) != (mGameOverByPlayerErrorPlayerId)) {
                return player;
            }
        }
    }
    if (winner != 0) {
        for (com.theaigames.uttt.player.Player player : mPlayers) {
            if ((player.getId()) == winner) {
                return player;
            }
        }
    }
    return null;
}