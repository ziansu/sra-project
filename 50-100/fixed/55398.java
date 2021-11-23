public boolean endRun() {
    if ((power) == false) {
        return false;
    }
    if ((currentRun) == null) {
        return false;
    }
    int runNumber = currentRun.getRunNumber();
    java.lang.String runNumberString = java.lang.Integer.toString(runNumber);
    java.lang.String exportInput = ("RUN" + runNumberString) + ".txt";
    export(exportInput);
    currentRun = null;
    return true;
}