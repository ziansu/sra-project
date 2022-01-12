@java.lang.Override
public void run() {
    this.checkState();
    org.osgp.adapter.protocol.dlms.application.threads.RecoverKeyProcess.LOGGER.info("Attempting key recovery for device {}", this.deviceIdentification);
    try {
        this.initDevice();
    } catch (final java.lang.Exception e) {
        final java.lang.String errorMessage = java.lang.String.format("Unexpected exception: {}", e);
        org.osgp.adapter.protocol.dlms.application.threads.RecoverKeyProcess.LOGGER.error(errorMessage);
    }
    if (!(this.device.hasNewSecurityKey())) {
        return ;
    }
    if (this.canConnect()) {
        this.promoteInvalidKey();
    }
}