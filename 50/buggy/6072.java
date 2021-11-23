@java.lang.Override
public boolean isShowDone(org.smartreaction.battletechdomination.model.players.Player player) {
    return ((selectedCards.size()) > 0) && ((player.getHand().size()) == (cardsToDiscardDownTo));
}