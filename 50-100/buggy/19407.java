public void RemovePlayerCard(main.java.Game.Player player) {
    for (int i = 1; i < (CURRENT_HAND.size()); i++) {
        if (player.hand.contains(CURRENT_HAND.get(i).substring(4))) {
            player.hand.remove(player.hand.indexOf(CURRENT_HAND.get(i).substring(4)));
        }
    }
}