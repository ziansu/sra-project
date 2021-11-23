public void setTime(int time) {
    try {
        int previousTime = getTime();
        this.firePropertyChange(IMedia.PROP_TIME, previousTime, time);
        mediaPlayerComponent.setTime(time);
    } catch (java.lang.Exception ex) {
        org.eclipse.core.runtime.IStatus status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, synergyviewcore.Activator.PLUGIN_ID, ex.getMessage(), ex);
        logger.log(status);
    }
}