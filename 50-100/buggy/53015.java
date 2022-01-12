public void getEventDetails(java.lang.String cmd, java.lang.String name) {
    alertBuilder.clear();
    try {
        dataChannel.sendCmd(cmd, name);
        network.PacketWrapper wrapper = dataChannel.receivePacket();
        et.append(wrapper.extraInfo());
    } catch (network.NetworkException e) {
        et.append(e.getMessage());
    }
    alertBuilder.showAlert();
}