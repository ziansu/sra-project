public final void removedService(org.osgi.framework.ServiceReference reference, java.lang.Object service) {
    org.apache.felix.webconsole.SimpleWebConsolePlugin plugin = this.plugin;
    if (plugin != null) {
        org.apache.felix.webconsole.plugins.upnp.internal.ControlServlet controller = ((org.apache.felix.webconsole.plugins.upnp.internal.WebConsolePlugin) (plugin)).controller;
        if (controller != null)
            controller.removedService(reference, service);
        
    }
    if (((tracker.getTrackingCount()) == 0) && (plugin != null)) {
        plugin.unregister();
        this.plugin = null;
    }
}