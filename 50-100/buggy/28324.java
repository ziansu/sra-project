public boolean build() {
    reset();
    while (jmri.jmrit.operations.trains.TrainManager.instance().isAnyTrainBuilding()) {
        synchronized(this) {
            try {
                wait(100);
            } catch (java.lang.InterruptedException e) {
                e.printStackTrace();
            }
        }
    } 
    runScripts(getBuildScripts());
    jmri.jmrit.operations.trains.TrainBuilder tb = new jmri.jmrit.operations.trains.TrainBuilder();
    boolean results = tb.build(this);
    setPrinted(false);
    setSwitchListStatus(jmri.jmrit.operations.trains.Train.UNKNOWN);
    runScripts(getAfterBuildScripts());
    return results;
}