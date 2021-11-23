protected void deregisterAll() {
    for (final java.util.Map.Entry<java.lang.String, org.wirez.core.client.shape.view.event.ViewHandler<?>> entry : handlers.entrySet()) {
        handlers.clear();
    }
}