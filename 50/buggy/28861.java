public void addSiteListener(ch.entwine.weblounge.kernel.site.SiteServiceListener listener) {
    synchronized(listenersLock) {
        listeners.add(listener);
    }
}