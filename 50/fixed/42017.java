public void advanceStep(int steps) {
    step += steps;
    turn = ((step) / (playerCount)) + 1;
}