public net.parostroj.timetable.model.ls.impl4.TrainDiagram getTrainDiagram() {
    if ((diagram) == null) {
        throw new java.lang.IllegalStateException("Diagram already created");
    }
    new net.parostroj.timetable.actions.AfterLoadCheck().check(diagram);
    diagram.getChangesTracker().setTrackingEnabled(trackChanges);
    if (trackChanges) {
        diagram.getChangesTracker().addVersion(null, null, null);
        diagram.getChangesTracker().setLastAsCurrent();
    }
    this.finishCirculationSequences();
    net.parostroj.timetable.model.ls.impl4.TrainDiagram retValue = diagram;
    diagram = null;
    return retValue;
}