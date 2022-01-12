@java.lang.Override
public com.gregswebserver.catan.common.game.teams.TeamColor get() {
    return secondRound() ? turnOrder.get((((turnOrder.size()) - ((turnNumber) % (turnOrder.size()))) - 1)) : turnOrder.get(((turnNumber) % (turnOrder.size())));
}