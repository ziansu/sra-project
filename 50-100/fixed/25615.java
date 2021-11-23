@java.lang.Override
public boolean apply(mage.game.Game game, mage.abilities.Ability source) {
    for (java.util.UUID targetPlayerId : targetPointer.getTargets(game, source)) {
        mage.players.Player player = game.getPlayer(targetPlayerId);
        if (player != null) {
            player.discard(amount.calculate(game, source, this), randomDiscard, source, game);
        }
    }
    return true;
}