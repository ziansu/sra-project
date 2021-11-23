public void displayNewGrid() {
    removeGrid();
    beetleKit.setKitProgress(((beetleKit.getKitProgress()) + 1));
    beetleKit.setUserKitProgress(beetleKit.getKitProgress());
    if (!(hasViewedAnswer)) {
        (currentGridNum)++;
    }
    java.lang.System.out.println(("current grid num " + (currentGridNum)));
    hasViewedAnswer = false;
    createNextRound();
}