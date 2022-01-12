protected uk.ac.open.kmi.forge.ptAnywhere.analytics.InteractionRecord create() {
    if ((this.irp) == null)
        return new uk.ac.open.kmi.forge.ptAnywhere.analytics.NoTracker();
    
    try {
        return new uk.ac.open.kmi.forge.ptAnywhere.analytics.TinCanAPI(this.irp.getEndpoint(), this.irp.getUsername(), this.irp.getPassword(), this.executor);
    } catch (java.net.MalformedURLException e) {
        uk.ac.open.kmi.forge.ptAnywhere.analytics.InteractionRecordFactory.LOGGER.error(e.getMessage());
        return new uk.ac.open.kmi.forge.ptAnywhere.analytics.NoTracker();
    }
}