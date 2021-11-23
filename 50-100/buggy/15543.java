public int nextStep(int current) {
    if (!(this.stepCorrect(current))) {
        return -69;
    }
    this.needsRefresh = true;
    int move = this.getComputerMove(current);
    com.puzzlegalaxy.slider.Main.debug(("MOVE: " + (this.stepsTaken)));
    (this.stepsTaken)++;
    this.solved = move == 9;
    return move;
}