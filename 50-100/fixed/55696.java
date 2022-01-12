public void parse(byte[] data) {
    userCode = data[0];
    home = (data[1]) >>> 4;
    unit = (data[1]) & 15;
    commandFrame = new org.openhab.binding.plcbus.internal.protocol.CommandFrame();
    commandFrame.parse(new byte[]{ data[2] , data[3] , data[4] });
}