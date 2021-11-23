@java.lang.Override
protected void loadContents() {
    contents.setLines(robotRun.loadInstructions(robotRun.getActiveProg(), true));
}