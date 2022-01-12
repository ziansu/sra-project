private void addControlsToGrid() {
    grid.add(taskId, 0, 0);
    grid.add(checkBox, 1, 0);
    grid.add(taskName, 2, 0);
    grid.add(taskStartDate, 3, 0, 1, 1);
    grid.add(taskDeadLine, 4, 0, 1, 1);
}