public static java.util.ArrayList<Event> getEvents() throws java.io.IOException {
    java.io.BufferedReader defaultFileReader = Storage.createDefaultFileReader();
    java.util.ArrayList<Event> events = new java.util.ArrayList<Event>();
    java.lang.String fileLineContent;
    while ((fileLineContent = defaultFileReader.readLine()) != null) {
        Event event = Storage.getEventFromLine(fileLineContent);
        events.add(event);
    } 
    defaultFileReader.close();
    return events;
}