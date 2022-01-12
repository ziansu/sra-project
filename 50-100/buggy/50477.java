@java.lang.Override
public seventh.game.Player getNextPlayerToSpectate(seventh.game.Players players, seventh.game.Player spectator) {
    if (spectator.isPureSpectator()) {
        return players.getRandomAlivePlayer();
    }
    seventh.game.Player player = spectator.getSpectating();
    return player != null ? spectator.getTeam().getNextAlivePlayerFrom(player) : spectator.getTeam().getAlivePlayer();
}