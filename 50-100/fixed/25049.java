public be.glever.ant.channel.AntChannel[] listDevices() {
    be.glever.ant.channel.AntChannel channel = new be.glever.ant.channel.AntChannel();
    channel.setChannelType(AntChannelType.BIDIRECTIONAL_SLAVE);
    channel.setNetwork(null);
    channel.setRfFrequency(new be.glever.ant.channel.AntChannelRfFrequency(be.glever.antplus.hrm.HeartRateMonitorSlave.ANTPLUS_HRM_FREQUENCY));
    be.glever.ant.channel.AntChannelId channelId = new be.glever.ant.channel.AntChannelId();
    channelId.setTransmissionType(AntChannelTransmissionType.PAIRING_TRANSMISSION_TYPE);
    channelId.setDeviceNumber(new byte[]{ 0 , 0 });
    channelId.setDeviceType(((byte) (120)));
    return null;
}