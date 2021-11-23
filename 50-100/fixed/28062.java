private java.util.List<java.lang.String> getEventNamesToSend() {
    java.util.List<java.lang.String> eventNames = new java.util.ArrayList<>();
    eventNames.add("event_EiffelArtifactCreatedEvent");
    eventNames.add("event_EiffelArtifactPublishedEvent");
    eventNames.add("event_EiffelConfidenceLevelModifiedEvent");
    eventNames.add("event_EiffelTestCaseStartedEvent");
    eventNames.add("event_EiffelTestCaseFinishedEvent");
    return eventNames;
}