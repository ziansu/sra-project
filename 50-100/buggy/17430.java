public void begin(ml.player.PlayerList player) {
    for (int i = 0; i < (player.size()); ++i) {
        player.getPlayer(i).getMoney().setInitialMoney();
        player.getPlayer(i).setPos(0);
    }
}