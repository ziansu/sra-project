public void removeOpenSession(javax.websocket.Session session) {
    synchronized(this) {
        openSessions.remove(session);
        if (((waiterCount) > 0) && (openSessions.isEmpty())) {
            notifyAll();
            if ((doneTask) != null) {
                doneTask.run();
                doneTask = null;
            }
        }
    }
}