public boolean resetBO() {
    if ((state) == (BuildOffState.CLOSED)) {
        state = BuildOffState.DISABLED;
        for (int plotNr : plots.keySet()) {
            resetPlot(plotNr, false);
        }
        themeSign.update(true);
        return true;
    }
    return false;
}