public void register() {
    try {
        initialize();
        super.register();
    } catch (org.eclipse.scanning.api.malcolm.MalcolmDeviceException e) {
        org.eclipse.scanning.malcolm.core.MalcolmDevice.logger.error(("Could not initialize malcolm device " + (org.eclipse.scanning.malcolm.core.MalcolmDevice.getName())), e);
    }
}