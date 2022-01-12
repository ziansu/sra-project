public void attack(GameObjects.Enemy enemy) {
    stopAction();
    tookAction = true;
    GameObjects.MapCell cell = myCells.get(((myX) + (targetX))).get(((myY) + (targetY)));
    GameObjects.Enemy e = cell.getEnemy();
    e.doDamage(myAction);
    chargeForAction(cell);
}