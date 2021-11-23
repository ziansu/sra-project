@java.lang.Override
public void close() {
    if ((pingHandler) != null) {
        try {
            pingHandler.cancel(false);
        } catch (java.lang.Exception ignored) {
        }
        pingHandler = null;
    }
    if ((writer) != null) {
        try {
            writer.close();
        } catch (java.lang.Exception ignored) {
        }
        writer = null;
    }
}