private boolean isSessionTime(java.util.Date sessionStartDateAndTime) {
    java.util.List<model.Session> sessions = manager.getDatabaseController().selectSession(sessionStartDateAndTime);
    return !((sessions == null) || (sessions.isEmpty()));
}