public void endRun() {
    if ((power) == false) {
        return ;
    }
    if ((currentRun) == null) {
        return ;
    }
    int runNumber = currentRun.getRunNumber();
    java.lang.String runNumberString = java.lang.Integer.toString(runNumber);
    java.lang.String exportInput = ("RUN" + runNumberString) + ".txt";
    export(exportInput);
    currentRun = null;
}