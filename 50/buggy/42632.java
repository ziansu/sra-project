@java.lang.SuppressWarnings(value = "unused")
public void invalidate() {
    if ((session) != null) {
        synchronized(session) {
            session.invalidate();
            session = null;
            entries = null;
        }
    }
}