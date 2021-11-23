public void moveToNextStep() {
    checks.set(getPosition(), true);
    setPosition(java.lang.Math.min(((getPosition()) + 1), getStepsCount()));
}