public void updateInstructions() {
    int instSize = getActiveRobot().getActiveProg().getInstructions().size();
    getActiveRobot().setActiveInstIdx(min(getActiveRobot().getActiveInstIdx(), instSize));
    lastScreen();
}