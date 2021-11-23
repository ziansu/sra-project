@org.junit.Test
public void recordExperimentsEvents() throws java.lang.Exception {
    java.util.Map<com.intuit.wasabi.experimentobjects.Experiment.Label, java.util.Map<com.intuit.wasabi.assignmentobjects.User.ID, java.util.List<com.intuit.wasabi.analyticsobjects.Event>>> eventList = new java.util.HashMap<>();
    thrown.expect(java.lang.UnsupportedOperationException.class);
    thrown.expectMessage("Not implemented");
    resource.recordExperimentsEvents(applicationName, eventList);
}