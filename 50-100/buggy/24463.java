public boolean removeTower(tower.Tower tower) {
    boolean worked = board.removeTower(tower);
    if (worked) {
        this.changeCoins(tower.getValue());
        towers.remove(tower);
        java.lang.System.out.println("Tower sold.");
        return true;
    }else {
        return false;
    }
}