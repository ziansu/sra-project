private void reduceMoney(monoply.game.Player player, java.util.ArrayList<monoply.game.Player> players) {
    for (int i = 0; i < (players.size()); i++) {
        if ((players.get(i)) == player)
            continue;
        else {
            if (((players.get(i).money) - 50) >= 0) {
                players.get(i).money -= 50;
                player.money += 50;
            }else {
            }
        }
    }
}