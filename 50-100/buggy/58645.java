private com.nilhcem.droidcontn.data.app.model.Session findSelectedSession(int slotId, java.util.List<com.nilhcem.droidcontn.data.app.model.Session> slotSessions) {
    com.nilhcem.droidcontn.data.app.model.Session selectedSession = null;
    int selectedSessionId = dao.get(slotId);
    if (selectedSessionId != 0) {
        for (com.nilhcem.droidcontn.data.app.model.Session session : slotSessions) {
            if ((session.getId()) == selectedSessionId) {
                selectedSession = session;
                break;
            }
        }
    }
    return selectedSession;
}