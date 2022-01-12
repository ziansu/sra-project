public void learning() {
    if (((tick) % 4) == 0) {
        calculateReward();
        copyCurrentSVIntoPrevSV();
        generateCurrentStateVector();
        getQfromNet();
        qFunction();
        resetReward();
        doAction();
    }else {
        setTurnGunRight(robocode.util.Utils.normalRelativeAngleDegrees(enemyBearingFromGun));
    }
    setTurnRadarRight(robocode.util.Utils.normalRelativeAngleDegrees(enemyBearingFromRadar));
    scan();
    execute();
}