public void deductHealth(int healthLose, controllers.Player player) {
    int negativeHealth;
    if (((player.health) - healthLose) < 0) {
        negativeHealth = (player.health) - healthLose;
        player.health = healthLose + negativeHealth;
    }else {
        player.health -= healthLose;
    }
    player.injury = getInjured(player.health, player);
}