private java.util.List<input.ExternalEvent> readEvents(int nrof) {
    if (allEventsRead) {
        return new java.util.ArrayList<input.ExternalEvent>(0);
    }
    java.util.List<input.ExternalEvent> events = reader.readEvents(nrof);
    if ((nrof > 0) && ((events.size()) == 0)) {
        reader.close();
        allEventsRead = true;
    }
    return events;
}