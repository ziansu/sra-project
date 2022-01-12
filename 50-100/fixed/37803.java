@java.lang.Override
public boolean apply(mage.game.permanent.Permanent input, mage.game.Game game) {
    mage.players.Player owner = game.getPlayer(input.getOwnerId());
    return ((input.getCardType().contains(CardType.CREATURE)) && (owner != null)) && (owner.getCommandersIds().contains(input.getId()));
}