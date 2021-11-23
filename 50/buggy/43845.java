public void moveToNextStep() {
    checks.set(position, true);
    setPosition(java.lang.Math.min(((getPosition()) + 1), getStepsCount()));
}