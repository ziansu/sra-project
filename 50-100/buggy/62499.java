public boolean isMute() {
    try {
        return (mediaPlayerComponent.getMediaPlayer().getVolume()) == 0 ? true : false;
    } catch (java.lang.Exception ex) {
        org.eclipse.core.runtime.IStatus status = new org.eclipse.core.runtime.Status(org.eclipse.core.runtime.IStatus.ERROR, synergyviewcore.Activator.PLUGIN_ID, ex.getMessage(), ex);
        logger.log(status);
    }
    return false;
}