@org.givwenzen.annotations.DomainStep(value = "a firmware location configuration with (.*), (.*), and (.*)")
public void givenAFirmwareLocationConfigurationWith(final java.lang.String firmwareDomainConfig, final java.lang.String firmwarePathConfig, final java.lang.String firmwareExtensionConfig) {
    com.alliander.osgp.acceptancetests.firmwaremanagement.UpdateFirmwareSteps.LOGGER.info("[Given a firmware location configuration with {}, {}, and {}]", new java.lang.Object[]{ firmwareDomainConfig , firmwarePathConfig , firmwareExtensionConfig });
    try {
        final com.alliander.osgp.adapter.protocol.oslp.device.FirmwareLocation firmwareLocation = new com.alliander.osgp.adapter.protocol.oslp.device.FirmwareLocation(firmwareDomainConfig, firmwarePathConfig, firmwareExtensionConfig);
        this.messageProcessor.setFirmwareLocation(firmwareLocation);
    } catch (final java.lang.IllegalArgumentException e) {
        this.messageProcessor.setFirmwareLocation(null);
    }
}