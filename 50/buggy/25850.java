private boolean isCanBeatCheck(com.checkers.domain.vo.Check enemyCheck, com.checkers.domain.vo.Check myCheck, com.checkers.domain.vo.Field field) {
    java.util.ArrayList<com.checkers.domain.vo.Position> possibleStepsForEnemy = getPossibleSquareStepsForCheek(enemyCheck, true, field);
    return isHavePositionsOpositeWayForCheck(possibleStepsForEnemy, myCheck);
}