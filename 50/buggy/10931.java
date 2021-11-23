public void initGoal(int x, int y) {
    Goal newGoal = new Goal();
    goals.add(newGoal);
    board[y][x].placeGoal(newGoal);
}