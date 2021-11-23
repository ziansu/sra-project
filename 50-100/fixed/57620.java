public boolean upgradeTower(tower.Tower tower) {
    boolean worked;
    if (this.changeCoins(((-1) * (tower.getCost())))) {
        worked = board.upgradeTower(tower);
        return worked;
    }
    return false;
}