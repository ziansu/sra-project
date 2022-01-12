public void attackClose(java.util.ArrayList<gladiator.Enemy> enemies, double dmg, gladiator.Score s) {
    gladiator.Enemy closestEnemy = findClosestEnemy(enemies, this);
    double dist = distFromTarg(closestEnemy, this);
    if (dist < 100) {
        s.score += 50;
        attack(closestEnemy, dmg);
    }
}