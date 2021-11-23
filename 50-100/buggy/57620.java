public boolean upgradeTower(tower.Tower tower) {
    boolean worked = board.upgradeTower(tower);
    if (worked) {
        this.changeCoins(((-1) * (tower.getCost())));
        return true;
    }else {
        return false;
    }
}