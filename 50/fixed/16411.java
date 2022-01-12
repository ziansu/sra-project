public void advanceStep(int steps) {
    step += steps;
    turn = ((step) / (players.size())) + 1;
}