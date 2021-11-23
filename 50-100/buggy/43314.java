protected void addDestinationRoute(int playerID, model.DestinationRoute route) {
    model.Player player = null;
    for (int i = 0; i < (players.size()); i++) {
        if ((players.get(i).getPlayerID()) == playerID) {
            player = players.get(i);
        }
        player.getDestinationRoute().add(route);
        assert player.getDestinationRoute().contains(route);
    }
}