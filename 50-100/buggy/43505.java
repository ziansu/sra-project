public void updatePlayerPositions(java.util.ArrayList<player.Player> players) {
    for (int i = 0; i < (players.size()); i++) {
        desktop_resources.GUI.removeAllCars(players.get(i).getName());
        desktop_resources.GUI.setCar(players.get(i).getPosition(), players.get(i).getName());
    }
}