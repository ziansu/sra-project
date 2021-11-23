public boolean isGoal() {
    Board tmp = new Board(goal);
    return this.equals(tmp);
}