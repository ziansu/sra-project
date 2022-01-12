@java.lang.Override
protected void loadLabels() {
    labels[0] = "[Create]";
    if ((robotRun.getActiveRobot().numOfPrograms()) > 0) {
        labels[1] = "[Rename]";
        labels[2] = "[Delete]";
        labels[3] = "[Copy]";
    }else {
        labels[1] = "";
        labels[2] = "";
        labels[3] = "";
    }
    labels[4] = "";
}