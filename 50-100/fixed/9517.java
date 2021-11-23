private void addPlayer(int id, int x, int y) {
    boolean flag = true;
    for (player.Player foo : players) {
        if ((foo.getID()) == id) {
            flag = false;
            foo.set(x, y);
            break;
        }
    }
    if (flag) {
        players.add(new player.Player(id));
    }
}