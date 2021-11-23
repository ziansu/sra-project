@java.lang.SuppressWarnings(value = "unused")
public void invalidate() {
    if ((session) != null) {
        synchronized(this) {
            session.invalidate();
            session = null;
            entries = null;
        }
    }
}