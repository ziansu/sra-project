private void sendPacketsInWindow() throws UDPConnection.Exception.UDPException {
    for (int i = Window_Position; (i < (Window_Size)) && (i < ((Packet_Buffer.size()) - 1)); ++i) {
        if ((Packet_Buffer.get(i).getAcknowledgementCode()) != (HTTPConnection.AcknowledgementCode.Acknowledged)) {
            Packet_Buffer.get(i).Transmit();
        }
    }
}