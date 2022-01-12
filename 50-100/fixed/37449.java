private void setProperties(org.openhab.binding.max.internal.message.M_Message message) {
    org.eclipse.smarthome.config.core.Configuration configuration = editConfiguration();
    for (org.openhab.binding.max.internal.device.RoomInformation room : message.rooms) {
        configuration.put(("room" + (java.lang.Integer.toString(room.getPosition()))), room.getName());
        logger.trace("Room '{}' name='{}'", ("Room" + (java.lang.Integer.toString(room.getPosition()))), room.getName());
    }
    updateConfiguration(configuration);
    logger.debug("Room properties updated");
    roomPropertiesSet = true;
}