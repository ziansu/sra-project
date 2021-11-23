@java.lang.Override
public synchronized void close() {
    try {
        if ((provider) != null) {
            provider.closeWorkBook();
            provider = null;
            data = null;
        }
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}