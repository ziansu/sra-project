public boolean removeTower(tower.Tower tower) {
    boolean worked;
    if (this.changeCoins(tower.getValue())) {
        worked = board.removeTower(tower);
        if (worked) {
            towers.remove(tower);
            java.lang.System.out.println("Tower sold.");
            return worked;
        }
        return false;
    }
    return false;
}