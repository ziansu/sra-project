public void stepRE() {
    try {
        long time = mediaPlayerComponent.getTime();
        long newTime = time - (synergyviewcore.media.model.VLCMedia.OFFSET);
        if (newTime < 0) {
            newTime = 0;
        }
        mediaPlayerComponent.setTime(time);
        firePropertyChange(IMedia.PROP_TIME, time, newTime);
    } catch (java.lang.Exception ex) {
        org.eclipse.core.runtime.IStatus status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, synergyviewcore.Activator.PLUGIN_ID, ex.getMessage(), ex);
        logger.log(status);
    }
}