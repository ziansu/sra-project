public static java.util.LinkedList<Event> getEvents() throws java.io.IOException {
    java.io.BufferedReader defaultFileReader = Storage.createDefaultFileReader();
    java.util.LinkedList<Event> events = new java.util.LinkedList<Event>();
    java.lang.String fileLineContent;
    while ((fileLineContent = defaultFileReader.readLine()) != null) {
        Event event = Storage.getEventFromLine(fileLineContent);
        events.add(event);
    } 
    defaultFileReader.close();
    return events;
}