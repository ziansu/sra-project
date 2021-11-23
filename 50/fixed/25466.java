public synchronized void add(final com.enonic.xp.web.handler.WebHandler handler) {
    if (this.handlers.contains(handler)) {
        return ;
    }
    this.handlers.add(handler);
    updateList();
}