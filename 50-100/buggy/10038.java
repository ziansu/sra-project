public int attack(edu.cis232.gwasos.resources.Combat enemy) {
    java.util.Random rand = new java.util.Random();
    int monsterCurrentHp = enemy.getHp();
    int r = rand.nextInt(((5 + (enemy.getAgility())) - (getAgility())));
    if (r <= 3) {
        setMissed(false);
        enemy.damage(power);
        setPreviousAttackDamage((monsterCurrentHp - (enemy.getHp())));
    }else {
        setMissed(true);
    }
    return previousAttackDamage;
}