@net.openhft.chronicle.core.annotation.HotMethod
private boolean runOneTenthLowHandler(int i) {
    boolean busy = false;
    for (int j = i; j < (mediumHandlers.size()); j += 10) {
        net.openhft.chronicle.threads.api.EventHandler handler = mediumHandlers.get(j);
        try {
            busy |= handler.action();
        } catch (net.openhft.chronicle.threads.api.InvalidEventHandlerException e) {
            mediumHandlers.remove((i--));
            net.openhft.chronicle.core.io.Closeable.closeQuietly(handler);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
    return busy;
}