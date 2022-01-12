public void removeFrom(org.xmobile.framework.events.EventHandler handler) {
    if ((mObserver) != null) {
        for (int i = 0; i < (mObserver.size()); i++) {
            org.xmobile.framework.events.EventHandler h = mObserver.get(i);
            if ((h.src) == (handler.src)) {
                mObserver.remove(h);
                return ;
            }
        }
    }
}