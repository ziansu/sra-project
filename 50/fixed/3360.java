public void setSteps(int steps) {
    this.steps = steps;
    this.progressCheck = ((int) ((steps / 99.0) + 1));
}