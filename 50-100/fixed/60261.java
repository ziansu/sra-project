protected edu.up.cs301.game.actionMsg.GameAction trickTaking() {
    if ((state.getPlayerCards().get(playerNum).size()) == 0)
        return null;
    
    java.util.ArrayList<edu.up.cs301.card.Card> cards = state.getLegalCards();
    edu.up.cs301.card.Card card = cards.get(((cards.size()) - 1));
    android.util.Log.i(allPlayerNames[playerNum], card.toString());
    return new edu.up.cs301.Pinochle.PinochlePlayCardAction(this, name, card);
}