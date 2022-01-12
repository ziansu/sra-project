public void attackClose(java.util.ArrayList<gladiator.Enemy> enemies, double dmg) {
    gladiator.Enemy closestEnemy = findClosestEnemy(enemies, this);
    double dist = distFromTarg(closestEnemy, this);
    if (dist < 100) {
        attack(closestEnemy, dmg);
    }
}