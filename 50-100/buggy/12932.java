private void setProperties(org.openhab.binding.max.internal.message.F_Message message) {
    ntpServer1 = message.getNtpServer1();
    ntpServer2 = message.getNtpServer2();
    org.eclipse.smarthome.config.core.Configuration configuration = org.openhab.binding.max.internal.handler.MaxCubeBridgeHandler.editConfiguration();
    configuration.put(org.openhab.binding.max.internal.handler.PROPERTY_NTP_SERVER1, ntpServer1);
    configuration.put(org.openhab.binding.max.internal.handler.PROPERTY_NTP_SERVER2, ntpServer2);
    updateConfiguration(configuration);
    logger.debug("NTP properties updated");
}