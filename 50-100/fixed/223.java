@java.lang.Override
public void run() {
    this.checkState();
    org.osgp.adapter.protocol.dlms.application.threads.RecoverKeyProcess.LOGGER.info("Attempting key recovery for device {}", this.deviceIdentification);
    try {
        this.initDevice();
    } catch (final java.lang.Exception e) {
        org.osgp.adapter.protocol.dlms.application.threads.RecoverKeyProcess.LOGGER.error("Unexpected exception: {}", e);
    }
    if (!(this.device.hasNewSecurityKey())) {
        return ;
    }
    if (this.canConnect()) {
        this.promoteInvalidKey();
    }
}