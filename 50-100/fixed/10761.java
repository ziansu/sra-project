public void learning() {
    calculateReward();
    copyCurrentSVIntoPrevSV();
    generateCurrentStateVector();
    getQfromNet();
    qFunction();
    resetReward();
    doAction();
    setTurnGunRight(robocode.util.Utils.normalRelativeAngleDegrees(enemyBearingFromGun));
    setTurnRadarRight(robocode.util.Utils.normalRelativeAngleDegrees(enemyBearingFromRadar));
    scan();
    execute();
}