public boolean setPlayerToHaveLargestArmy(int playerIndex) {
    if ((playerIndex < 0) || (playerIndex > 3))
        return false;
    
    if ((currentLargestArmyPlayer) != (-1)) {
        adjustPlayersPoints(currentLargestArmyPlayer, ((-1) * (LargestArmyValue)));
    }
    currentLargestArmyPlayer = playerIndex;
    adjustPlayersPoints(currentLargestArmyPlayer, LargestArmyValue);
    return true;
}