private void addTowers(java.util.ArrayList<java.awt.Point> towerPositions, int tick) {
    for (java.awt.Point point : towerPositions) {
        boolean alreadyCreated = false;
        for (MarioAI.enemySimuation.simulators.BulletBillTower bulletBillTower : bulletTowers) {
            if (((point.x) == (bulletBillTower.towerPos.x)) && ((point.y) == (bulletBillTower.towerPos.y))) {
                alreadyCreated = true;
                break;
            }
        }
        if (!alreadyCreated) {
            bulletTowers.add(new MarioAI.enemySimuation.simulators.BulletBillTower(point, (tick + 1)));
        }
    }
}