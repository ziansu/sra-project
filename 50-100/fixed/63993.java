public int getDuration() {
    try {
        return ((int) (mediaPlayerComponent.getLength()));
    } catch (java.lang.Exception ex) {
        org.eclipse.core.runtime.IStatus status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, synergyviewcore.Activator.PLUGIN_ID, ex.getMessage(), ex);
        logger.log(status);
        return 0;
    }
}