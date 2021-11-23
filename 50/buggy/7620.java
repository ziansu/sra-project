public void newSession() {
    currentSession = new munk.Session(currentSession.getSessionNumber());
    sessions.add(currentSession);
}