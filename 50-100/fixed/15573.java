public void displayNewGrid() {
    removeGrid();
    if (!(hasViewedAnswer)) {
        beetleKit.setKitProgress(((beetleKit.getKitProgress()) + 1));
        beetleKit.setUserKitProgress(beetleKit.getKitProgress());
        (currentGridNum)++;
    }
    hasViewedAnswer = false;
    createNextRound();
}