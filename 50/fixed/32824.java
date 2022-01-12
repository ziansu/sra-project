public final void decreaseMoves() {
    if (!(timeBased)) {
        --(moveCount);
        observer.updateSteps(moveCount);
        if ((moveCount) <= 0) {
            observer.stopLevel();
        }
    }
}