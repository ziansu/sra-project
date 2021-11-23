public void addSession(net.cellcloud.common.Session session) {
    synchronized(this.sessions) {
        if (this.sessions.contains(session)) {
            return ;
        }
        this.sessions.add(session);
        this.sessionHeartbeats.put(session.getId(), net.cellcloud.util.Clock.currentTimeMillis());
    }
}