@java.lang.Override
public synchronized void close() {
    try {
        session.close();
    } catch (java.io.IOException e) {
        return ;
    }
    session = null;
    this.currentSession = null;
    openSessions.remove(this.identity());
}