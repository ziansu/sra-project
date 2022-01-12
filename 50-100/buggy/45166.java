@java.lang.Override
public void play(battlecode.common.RobotController rc) throws battlecode.common.GameActionException {
    initializeArchon(rc);
    if ((team316.utils.Turn.currentTurn()) == 1) {
        figureOutRank(rc);
    }
    checkInbox(rc);
    seekHelpIfNeeded(rc);
    broadcastLateMessages(rc);
    figureOutDistribution();
    attemptActivateRobots(rc);
    if (!(inDanger)) {
        rc.setIndicatorString(1, "at least into attempBuild function.");
        attemptBuild(rc);
    }
    attemptRepairingWeakest(rc);
    adjustBattle(rc);
    attempMoving(rc);
}