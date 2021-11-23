public void bundleChanged(pl.net.bluesoft.rnd.processtool.plugins.osgi.BundleEvent event) {
    try {
        if ((((BundleEvent.STARTED) | (BundleEvent.STOPPED)) & (event.getType())) != 0) {
            processBundleExtensions(event.getBundle(), event.getBundle().getState(), registry.getProcessToolContextFactory());
        }
    } catch (java.lang.ClassNotFoundException e) {
        pl.net.bluesoft.rnd.processtool.plugins.osgi.PluginHelper.LOGGER.log(java.util.logging.Level.SEVERE, "Exception processing bundle", e);
        throw new java.lang.RuntimeException(e);
    }
}