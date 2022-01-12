@java.lang.Override
public java.lang.String toString() {
    final java.lang.String current = ((m_current.get()) != null) ? m_current.get().toString() : "no current task";
    final java.lang.String queue = ((m_queue.size()) > 0) ? m_queue.toString() : "[queue empty]";
    final java.lang.String toReturn = (current + " ") + queue;
    return toReturn;
}