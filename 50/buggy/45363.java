private boolean isSessionTime(java.util.Date sessionStartDateAndTime) {
    java.util.ArrayList<model.Session> sessions = manager.getDatabaseController().selectSession(sessionStartDateAndTime);
    return !((sessions == null) || (sessions.isEmpty()));
}