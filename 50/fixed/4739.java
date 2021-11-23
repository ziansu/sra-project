private void revertTowers() {
    if ((this.towers.size) > 0) {
        for (towers.Tower t : towers) {
            towerBoost.unBoost(t);
        }
    }
}