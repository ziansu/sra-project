public void winLevel() {
    stop();
    for (com.sem.btrouble.observering.LevelObserver obj : observersList) {
        obj.levelWon();
    }
    bubbleController = new com.sem.btrouble.controller.BubbleController(new com.sem.btrouble.controller.CollisionHandler());
}