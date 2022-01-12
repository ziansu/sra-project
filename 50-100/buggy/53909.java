private void cubeReboot() {
    logger.info("Rebooting MAX! Cube {}", org.openhab.binding.max.internal.handler.MaxCubeBridgeHandler.getThing().getThingTypeUID());
    org.openhab.binding.max.config.MaxCubeBridgeConfiguration maxConfiguration = org.openhab.binding.max.internal.handler.MaxCubeBridgeHandler.getConfigAs(org.openhab.binding.max.config.MaxCubeBridgeConfiguration.class);
    org.openhab.binding.max.internal.command.UdpCubeCommand reset = new org.openhab.binding.max.internal.command.UdpCubeCommand(UdpCubeCommand.udpCommandType.RESET, maxConfiguration.serialNumber);
    reset.setIpAddress(maxConfiguration.ipAddress);
    reset.send();
}