public void doRandomMovement() {
    super.doRandomMovement();
    if (((target) != null) && ((target.getHealth()) <= 0)) {
        target = null;
    }
    getClosestEnemy();
    moveToLocation();
    moveTurrets();
    edgeGuard();
    getClosestEnemy();
}