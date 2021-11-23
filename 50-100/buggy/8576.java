public void donateToWin() throws k2so.GameActionException {
    float bullets = k2so.DefaultRobot.rc.getTeamBullets();
    int victoryPts = k2so.DefaultRobot.rc.getTeamVictoryPoints();
    int potentialPts = ((int) (bullets)) * (GameConstants.BULLET_EXCHANGE_RATE);
    if (((GameConstants.VICTORY_POINTS_TO_WIN) - victoryPts) <= potentialPts) {
        k2so.DefaultRobot.rc.donate(bullets);
    }
}