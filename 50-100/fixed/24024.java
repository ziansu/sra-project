public void loadRecurringEventsFile() {
    java.io.File recurring_events_file = new java.io.File(Model.RECURRING_EVENTS_FILE_NAME);
    try {
        java.io.FileReader file_reader = new java.io.FileReader(recurring_events_file);
        java.io.BufferedReader buffered_reader = new java.io.BufferedReader(file_reader);
        java.lang.String next_line = "";
        while ((next_line = buffered_reader.readLine()) != null) {
            createRecurringEvent(next_line.split(";"));
        } 
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}