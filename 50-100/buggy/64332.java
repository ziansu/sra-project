public void updateInstructions() {
    int instSize = getActiveRobot().getActiveProg().getInstructions().size();
    getActiveRobot().setActiveInstIdx(min(getActiveRobot().getActiveInstIdx(), (instSize - 1)));
    contents.setLineIdx(min(getActiveRobot().getActiveInstIdx(), ((ITEMS_TO_SHOW) - 1)));
    contents.setColumnIdx(0);
    lastScreen();
}