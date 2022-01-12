private boolean saveToFile(java.lang.String filename, carelender.model.EventList eventList) {
    try {
        java.io.PrintWriter printWriter = new java.io.PrintWriter(filename);
        com.google.gson.Gson gson = new com.google.gson.Gson();
        java.lang.String json = gson.toJson(eventList);
        printWriter.println(json);
        printWriter.flush();
        printWriter.close();
        return true;
    } catch (java.io.IOException ioe) {
        carelender.model.Model.log.log(java.util.logging.Level.FINE, "Failed to save event to file");
        return false;
    }
}