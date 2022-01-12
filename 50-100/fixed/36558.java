private void fetchSessions() {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    try {
        java.io.File file = new java.io.File("sessions.json");
        java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
        sessions = mapper.readValue(fileInputStream, mapper.getTypeFactory().constructCollectionType(java.util.ArrayList.class, me.itsrishi.exercisecounter.models.Session.class));
        fileInputStream.close();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}