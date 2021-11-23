public void getEvents(java.lang.String cmd) {
    alertBuilder.clear();
    try {
        dataChannel.sendCmd(cmd);
        network.PacketWrapper wrapper = dataChannel.receivePacket();
        et.append(wrapper.extraInfo());
    } catch (network.NetworkException e) {
        et.append(e.getMessage());
    }
    alertBuilder.showAlert();
}