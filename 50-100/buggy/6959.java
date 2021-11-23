private void UpdatePlayerTable() {
    playerTable.clearChildren();
    playerTable.add(new io.github.teamfractal.actors.Label("List of Players for the Game", this.game.skin));
    playerTable.row();
    for (int i = 0; i < (newPlayerNames.size()); i++) {
        java.lang.System.out.print(((newPlayerNames.get(i)) + "\n"));
        playerTable.add(new io.github.teamfractal.actors.Label(newPlayerNames.get(i), this.game.skin));
        playerTable.row();
    }
}