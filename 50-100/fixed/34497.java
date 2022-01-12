public final void broadcast(dto.server.ServerCommand cmd, java.util.function.Predicate<players.Player> predicate) {
    java.util.LinkedList<players.Player> receivers = new java.util.LinkedList(players);
    receivers.removeIf(predicate.negate());
    for (players.Player player : receivers)
        player.send(cmd);
    
}