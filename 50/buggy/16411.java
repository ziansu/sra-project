public void advanceStep(int steps) {
    java.lang.System.out.println(step);
    step += steps;
    turn = ((step) / (players.size())) + 1;
}