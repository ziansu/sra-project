public static Models.Enemy createEnemy(Models.Player player) {
    int attack = ((player.getAttack()) + (Logic.CombatLogic.rand.nextInt(3))) - 1;
    int health = ((player.getMaxHealth()) + (Logic.CombatLogic.rand.nextInt(3))) - 1;
    if (attack <= 0) {
        attack = 1;
    }
    if (health <= 0) {
        health = 1;
    }
    Models.Enemy newEnemy = new Models.Enemy("Random Name", attack, health);
    return newEnemy;
}