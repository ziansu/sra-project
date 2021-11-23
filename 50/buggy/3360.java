public void setSteps(int steps) {
    this.steps = steps;
    this.progressCheck = ((int) (steps + (1 / 99.0)));
}