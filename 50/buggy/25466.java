public synchronized void add(final com.enonic.xp.web.handler.WebHandler handler) {
    this.handlers.add(handler);
    updateList();
}