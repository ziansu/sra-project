public void removeFrom(org.xmobile.framework.events.EventHandler handler) {
    if ((mObserver) != null) {
        for (org.xmobile.framework.events.EventHandler h : mObserver) {
            if ((h.src) == (handler.src)) {
                mObserver.remove(h);
            }
        }
    }
}