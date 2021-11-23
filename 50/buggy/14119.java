@java.lang.Override
protected void sendUpdatedStateTo(edu.up.cs301.game.GamePlayer p) {
    android.util.Log.d("sending state", "updated state");
    edu.up.cs301.blokus.BlokusGameState copyState = new edu.up.cs301.blokus.BlokusGameState(gameState);
    p.sendInfo(((edu.up.cs301.game.infoMsg.GameState) (copyState)));
}