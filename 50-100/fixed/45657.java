private boolean useCombinedLoad() {
    final com.alliander.osgp.adapter.protocol.iec61850.domain.repositories.Iec61850DeviceRepository repository = com.alliander.osgp.adapter.protocol.iec61850.application.config.BeanUtil.getBean(com.alliander.osgp.adapter.protocol.iec61850.domain.repositories.Iec61850DeviceRepository.class);
    final com.alliander.osgp.adapter.protocol.iec61850.domain.entities.Iec61850Device device = repository.findByDeviceIdentification(this.deviceIdentification);
    if (device != null) {
        return device.isUseCombinedLoad();
    }
    return com.alliander.osgp.adapter.protocol.iec61850.application.config.BeanUtil.getBeanByName("defaultUseCombinedLoad", java.lang.Boolean.class);
}