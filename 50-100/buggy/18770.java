public void addSession(net.cellcloud.common.Session session) {
    synchronized(this.sessions) {
        if (this.sessions.contains(session)) {
            return ;
        }
        this.sessions.add(session);
        this.sessionHeartbeats.add(new java.util.concurrent.atomic.AtomicLong(net.cellcloud.util.Clock.currentTimeMillis()));
    }
}