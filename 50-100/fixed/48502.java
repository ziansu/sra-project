public void letAImove() {
    int pushMousePointingColumn = mousePointingcolumn;
    boolean preEndGame = gameController.isFinish();
    if ((mousePointingcolumn = gameController.getAITurn()) < 0) {
        mousePointingcolumn = pushMousePointingColumn;
        return ;
    }
    if ((!preEndGame) && (!(fallingAnimationMutex))) {
        FallingAnimation();
    }
}