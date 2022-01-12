public void sendDeviceAndRoomNameUpdate(java.lang.String comment) {
    if ((devices.size()) > 0) {
        org.openhab.binding.max.internal.handler.SendCommand sendCommand = new org.openhab.binding.max.internal.handler.SendCommand((("Cube(" + (getThing().getUID().getId())) + ")"), new org.openhab.binding.max.internal.command.M_Command(devices, rooms), comment);
        queueCommand(sendCommand);
    }else {
        logger.debug("No devices to build room & device update message. Try later");
    }
}