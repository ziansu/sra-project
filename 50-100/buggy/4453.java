public boolean addTower(tower.Tower tower) {
    if ((playerCoins) >= (tower.getCost())) {
        boolean worked = board.addTower(tower);
        if (worked) {
            this.changeCoins(((-1) * (tower.getCost())));
            towers.add(tower);
            java.lang.System.out.println("New tower bought.");
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}