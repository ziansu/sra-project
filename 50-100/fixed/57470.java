public void printRun(ChronoTimer.ChronoTime commandTime, int runNum) {
    if (power) {
        try {
            officialTime = commandTime.withOffset(offset);
        } catch (Exceptions.InvalidTimeException e) {
            e.printStackTrace();
        }
        if ((!(runs.isEmpty())) && ((runs.size()) > runNum))
            runprinter.print(runs.get(runNum).getLog());
        else
            history.add((("runNum " + runNum) + " was invalid"));
        
    }
}