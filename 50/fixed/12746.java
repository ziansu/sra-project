@org.springframework.context.annotation.Bean
@org.springframework.context.annotation.Scope(value = org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_SINGLETON)
public com.alliander.osgp.adapter.protocol.oslp.device.FirmwareLocation firmwareLocation() {
    return new com.alliander.osgp.adapter.protocol.oslp.device.FirmwareLocation(com.alliander.osgp.acceptancetests.config.OslpConfig.FIRMWARE_DOMAIN, com.alliander.osgp.acceptancetests.config.OslpConfig.FIRMWARE_PATH);
}