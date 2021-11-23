private java.util.List<de.akquinet.engineering.vaadin.exercises.grid.Player> createPlayerList(final int count) {
    final java.util.List<de.akquinet.engineering.vaadin.exercises.grid.Player> playerList = new java.util.ArrayList<>(count);
    for (int i = 0; i < count; ++i) {
        playerList.add(createPlayer());
    }
    playerList.sort(java.util.Comparator.comparing(Player::getPoints).thenComparing(Player::getMedals).reversed());
    return playerList;
}