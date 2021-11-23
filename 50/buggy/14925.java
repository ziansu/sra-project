@java.lang.Override
protected void sendUpdatedStateTo(edu.up.cs301.game.GamePlayer p) {
    if ((state) == null) {
        return ;
    }
    edu.up.cs301.Pinochle.PinochleGameState copy = new edu.up.cs301.Pinochle.PinochleGameState(state);
    p.sendInfo(copy);
}