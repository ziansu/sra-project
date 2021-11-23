@java.lang.Override
public void publish(java.util.logging.LogRecord record) {
    for (; ;) {
        try {
            queue.put(record);
            break;
        } catch (java.lang.InterruptedException ex) {
            continue;
        }
    }
}