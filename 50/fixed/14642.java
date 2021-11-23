public void checkPlayerArmySize(int playerIndex, int armySize) {
    if ((this.currentLargestArmySize) < armySize) {
        this.currentLargestArmySize = armySize;
        this.setPlayerToHaveLargestArmy(playerIndex);
    }
}