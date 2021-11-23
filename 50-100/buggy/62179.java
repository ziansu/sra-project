@java.lang.Override
public com.gregswebserver.catan.common.game.teams.TeamColor get() {
    return secondRound() ? turnOrder.get((((1 + (turnOrder.size())) - (turnNumber)) % (turnOrder.size()))) : turnOrder.get(((turnNumber) % (turnOrder.size())));
}