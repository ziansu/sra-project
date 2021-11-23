public boolean insertStone(int column) {
    if ((numberOfClicks[column]) < 6) {
        this.column = column;
        numberOfClicks[column] += 1;
        java.lang.System.out.println((((this.toString()) + ":   ") + column));
        addTimerCompleted = false;
        addTimer.start();
        return true;
    }
    return false;
}