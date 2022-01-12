public void winLevel() {
    stop();
    for (com.sem.btrouble.observering.LevelObserver obj : observersList) {
        obj.levelWon();
    }
}