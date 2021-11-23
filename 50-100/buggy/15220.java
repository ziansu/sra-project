public void exportRun(ChronoTimer.ChronoTime commandTime, int runNum) {
    if (power) {
        try {
            officialTime = commandTime.withOffset(offset);
        } catch (Exceptions.InvalidTimeException e) {
            e.printStackTrace();
        }
        if ((!(runs.isEmpty())) && (runNum < (curRun)))
            runprinter.export(runNum, runs.get(runNum));
        else
            history.add((("runNum " + runNum) + " was invalid"));
        
    }
}