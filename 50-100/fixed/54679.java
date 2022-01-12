@java.lang.Override
public void update(java.lang.String sessionId, edu.jhuapl.dorset.sessions.SessionObject sessionObject) {
    edu.jhuapl.dorset.sessions.Session currentSession = this.sessions.get(sessionId);
    java.util.List<edu.jhuapl.dorset.sessions.SessionObject> sessionHistory = currentSession.getSessionHistory();
    sessionHistory.add(sessionObject);
    currentSession.setSessionHistory(sessionHistory);
    this.sessions.put(sessionId, currentSession);
}