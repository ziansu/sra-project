@net.openhft.chronicle.core.annotation.HotMethod
private boolean runHandlers() {
    boolean busy = false;
    synchronized(handlers) {
        for (int i = 0; i < (handlers.size()); i++) {
            net.openhft.chronicle.threads.api.EventHandler handler = handlers.get(i);
            try {
                busy |= handler.action();
            } catch (net.openhft.chronicle.threads.api.InvalidEventHandlerException e) {
                handlers.remove((i--));
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
        }
    }
    return busy;
}