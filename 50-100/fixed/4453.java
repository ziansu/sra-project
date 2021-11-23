public boolean addTower(tower.Tower tower) {
    boolean worked;
    if (this.changeCoins(((-1) * (tower.getCost())))) {
        worked = board.addTower(tower);
        if (worked) {
            towers.add(tower);
            java.lang.System.out.println("New tower bought.");
            return true;
        }
        return false;
    }
    return false;
}