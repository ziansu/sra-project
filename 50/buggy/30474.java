public void buyPlace(ml.player.Player player, int level) {
    setOwner(player);
    player.getMoney().addMoney(price[level]);
    ++(current_level);
}